package com.lambda.web.MusicEntity;

import com.lambda.web.MovieEntity.MovieDTO;
import com.lambda.web.MovieEntity.MovieRepository;
import com.lambda.web.proxy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
public class MusicController {
    @Autowired Crawler crawler;
    @Autowired Box<Object> box;
    @Autowired Proxy pxy;
    @Autowired MusicRepository musicRepository;
    @Autowired Pager pager;

    @PostMapping("/bugsmusic")
    public HashMap<String,Object> bugsmusic(@RequestBody String searchWord
                                           ){
        if(searchWord.equals("")){
            pxy.print("검색어가 없음");
        }else{
            pxy.print("검색어가" + searchWord);
        }
        box.clear();
        if(musicRepository.count() == 0) crawler.bugsMusic();

        pager.setBlockSize(5);
        pager.setPageSize(5);
        pager.paging();
        IFunction<Pager,List<Music>> f = p -> musicRepository.findAll();
        List<Music> l = f.apply(pager);
        pxy.print("*******************");
        for(Music m : l){
            pxy.print(m.toString());
        }
        pxy.print(l.get(0).toString());

        box.clear();
        box.put("pager", pager);
        box.put("list", l);

        return box.get();
    }
}
