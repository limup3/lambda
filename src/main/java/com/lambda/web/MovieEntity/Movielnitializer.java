package com.lambda.web.MovieEntity;

import com.lambda.web.mappers.MovieMapper;
import com.lambda.web.proxy.ISupplier;
import com.lambda.web.proxy.MovieCrawler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class Movielnitializer implements ApplicationRunner {
    @Autowired MovieMapper movieMapper;
    @Autowired MovieCrawler movieCrawler;
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        ISupplier<Integer> s = () -> movieMapper.count();
        ISupplier<Integer> s = movieMapper::count;
        if(s.get() == 0) movieCrawler.naverMovie();
    }
}
