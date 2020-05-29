package com.lambda.web.proxy;

import com.lambda.web.MusicEntity.Music;
import com.lambda.web.MusicEntity.MusicRepository;
import com.lambda.web.soccer.Player;
import com.lambda.web.soccer.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("uploader") @Lazy
public class FileUploader extends Proxy {

    @Autowired Inventory<String> inventory;
    @Autowired PlayerRepository playerRepository;
    @Autowired MusicRepository musicRepository;
    @Autowired Crawler crawler;

    public void MusicUpload(){
//        inventory.clear();
        try {
//            ArrayList<HashMap<String,String>> list = crawler.bugsMusic();
            crawler.bugsMusic();
            Music m = new Music();

//            m.setArtists(list.get(0).get("artists"));
//            m.setSeq(list.get(0).get("seq"));
//            m.setTitle(list.get(0).get("title"));
//            m.setThumbnail(list.get(0).get("thumbnail"));
            print(m.toString());

            musicRepository.save(m);


        }catch(Exception e){
            e.printStackTrace();
            print("뮤직 리딩 실패");
        }
    }


    public void upload(){
        inventory.clear();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\bit\\IdeaProjects\\web\\src\\main\\resources\\static\\files\\player.csv")));
            String player ="";
            while((player = reader.readLine()) != null){
                inventory.add(player);
            }
        }catch (Exception e){
            print("파일 리딩 실패");
            e.printStackTrace();
        }
        print("------------------------------\n");
        print(inventory.get().get(0).toString());
        String[] arr = inventory.get().get(0).split(",");
        //"2000003","유동우","K10","YOU,  DONGWOO","","","DF","40","","07-MAR-1978","1","177","70"
        Player p = new Player();
        p.setPlayerId(arr[0]);
        p.setPlayerName(arr[1]);
//        p.getTeam().setTeamId(arr[2]);
        p.setePlayerName(arr[3]);
        p.setNickname(arr[4]);
        p.setJoinYyyy(arr[5]);
        p.setPosition(arr[6]);
        p.setBackNo(arr[7]);
        p.setNation(arr[8]);
        p.setBirthDate(arr[9]);
        p.setSolar(arr[10]);
        p.setHeight(arr[11]);
        p.setWeight(arr[12]);
        print("------------------------------\n");
        print(p.toString());
        playerRepository.save(p);
//        for(String s: inventory.get()){
//            String[] arr = s.split(",");
//
//        }
    }
}
