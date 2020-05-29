package com.lambda.web.proxy;

import com.lambda.web.MovieEntity.Movie;
import com.lambda.web.MovieEntity.MovieRepository;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("movie")
public class MovieCrawler extends Proxy {

    @Autowired Inventory<Movie> inventory;
    @Autowired MovieRepository movieRepository;

//순위 영화명
    public void naverMovie(){
        inventory.clear();
        try {
            String url ="https://movie.naver.com/movie/sdb/rank/rmovie.nhn";
            Connection.Response homepage = Jsoup.connect(url).method(Connection.Method.GET)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36")
                    .execute();
            Document d = homepage.parse();
            Elements title = d.select("div.tit3");
            Elements seq = d.select("tr>td.ac:nth-child(1)");
            Elements date = d.select("p.r_date");
            Movie movie = null;
            for(int i = 0 ; i< title.size(); i++){
                movie = new Movie();
                movie.setSeq(seq.get(i).select("img").attr("src"));
//                movie.setSeq(string(i+1));
                movie.setTitle(title.get(i).text());
                movie.setRankDate(date.get(0).text());
                movieRepository.save(movie);
            }

        }catch(Exception e){
            print("에러발생");
        }
        print("******************** 크롤링 결과 **************");
        inventory.get().forEach(System.out::print);
    }
}
