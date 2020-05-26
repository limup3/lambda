package com.lambda.web.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
//@RequestMapping("/proxy")
public class ProxyController {
    @Autowired Crawler crawler;
    @Autowired Box<Object> box;
    @Autowired Proxy pxy;

//    @GetMapping("")
//    public ArrayList<HashMap<String,String>> getlist(){
//        return crawler.bugsMusic();
//    }
    @PostMapping("/bugsmusic")
    public HashMap<String,Object> bugsmusic(@RequestBody String searchWord){
        pxy.print("넘어온 키워드:"+searchWord);
        box.clear();
        ArrayList<HashMap<String,String>> list = crawler.bugsMusic();
        box.put("list",list);
        pxy.print("***********");
        pxy.print("조회한 수 :" +list.size());
        box.put("count",list.size());
        return box.get();
    }
}
