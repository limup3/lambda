package com.lambda.web.MovieEntity;

import com.lambda.web.mappers.MovieMapper;
import com.lambda.web.proxy.Box;
import com.lambda.web.proxy.IFunction;
import com.lambda.web.proxy.Pager;
import com.lambda.web.proxy.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
@RequestMapping("/movies")
public class MovieController{
    @Autowired Pager pager;
    @Autowired MovieMapper movieMapper;
    @Autowired Proxy pxy;
    @Autowired Box<Object> box;
    @GetMapping("/{searchWord}/{pageNumber}")
    public Map<?,?> list(@PathVariable("pageNumber") String pageNumber,
                         @PathVariable("searchWord") String searchWord){
        if(searchWord.equals("")){
            pxy.print("검색어가 없음");
        }else{
            pxy.print("검색어가" + searchWord);
        }
        pxy.print("넘어온 페이지번호 : "+pageNumber);
        pager.setPageNow(pxy.integer(pageNumber.trim()));
        pager.setBlockSize(5);
        pager.setPageSize(5);
        pager.paging();
        IFunction<Pager,List<MovieDTO>> f = p -> movieMapper.selectMovies(p);
        List<MovieDTO> l = f.apply(pager);
        pxy.print("*******************");
        for(MovieDTO m : l){
            pxy.print(m.toString());
        }
        pxy.print(l.get(0).toString());

        box.clear();
        box.put("pager", pager);
        box.put("list", l);

        return box.get();
    }
    @GetMapping("")
    public Map<?,?> block(){
        pager.setBlockNow(pager.getBlockNow()+1);
        pxy.print(Integer.toString(pager.getBlockNow()));
        box.put("pager",pager);
        return box.get();
    }
}
