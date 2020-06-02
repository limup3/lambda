package com.lambda.web.MovieEntity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC) // getter setter만 쓰고 Data는 쓰지말기
@Entity(name="Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;
    private String title;
    private String seq;
    private String rankDate;

    @Builder
    public Movie(String title, String seq, String rankDate){
        this.title = title;
        this.seq = seq;
        this.rankDate = rankDate;
    }


}
