package com.lambda.web.services;

import com.lambda.web.MovieEntity.MovieDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MovieService {
    public List<MovieDTO> retrieveAll();
}
