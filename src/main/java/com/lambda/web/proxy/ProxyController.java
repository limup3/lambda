package com.lambda.web.proxy;

import com.lambda.web.MovieEntity.Movie;
import com.lambda.web.MovieEntity.MovieRepository;
import com.lambda.web.MusicEntity.Music;
import com.lambda.web.MusicEntity.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
//@RequestMapping("/proxy")
public class ProxyController {
    @Autowired Crawler crawler;
    @Autowired Box<Object> box;
    @Autowired Proxy pxy;
    @Autowired FileUploader uploader;
    @Autowired MusicRepository musicRepository;
    @Autowired MovieCrawler movieCrawler;
    @Autowired MovieRepository movieRepository;

//    @GetMapping("")
//    public ArrayList<HashMap<String,String>> getlist(){
//        return crawler.bugsMusic();
//    }
//    @PostMapping("/bugsmusic")
//    public HashMap<String,Object> bugsmusic(@RequestBody String searchWord){
//        pxy.print("넘어온 키워드:"+searchWord);
//        box.clear();
//
//        if(musicRepository.count() == 0){ crawler.bugsMusic(); }
//        List<Music> list = musicRepository.findAll();
//        box.put("list",list);
//        pxy.print("***********");
//        box.put("count",list.size());
//        return box.get();
//    }

    @GetMapping("/soccer/{searchWord}")
    public HashMap<String,Object> soccer(@PathVariable String searchWord){
        pxy.print("넘어온 키워드:"+searchWord);
        uploader.upload();
        return null;
    }

    @GetMapping("/movie/{searchWord}")
    public HashMap<String,Object> naverMovie(@PathVariable String searchWord){
        pxy.print("넘어온 키워드:"+searchWord);
        if(movieRepository.count() == 0 ) movieCrawler.naverMovie();
        List<Movie> list = movieRepository.findAll();
        box.put("list",list);
        pxy.print("***********");
        box.put("count",list.size());
        return box.get();
    }
}
