package com.lambda.web.MusicEntity;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity(name="Music")


public class Music {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mbrNo;
//    @Column(length = 200, nullable =false)

    private String seq, title, artists, thumbnail;

    @Builder
    public Music(String seq, String title, String artists, String thumbnail) {
        this.seq = seq;
        this.title = title;
        this.artists = artists;
        this.thumbnail = thumbnail;
    }
}
