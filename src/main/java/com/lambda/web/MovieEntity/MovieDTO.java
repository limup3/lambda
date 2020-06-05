package com.lambda.web.MovieEntity;


import com.lambda.web.MusicEntity.MusicDTO;
import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class MovieDTO {


    private String title;
    private String seq;
    private String rankDate;
    private Long no;
    private MusicDTO ost;


}
