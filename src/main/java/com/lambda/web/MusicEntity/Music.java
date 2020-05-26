package com.lambda.web.MusicEntity;

import lombok.*;
import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity(name="Music")
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class Music {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mbrNo;

    private String seq, title, artists, thumbnail;

    @Builder
    public Music(String seq, String title, String artists, String thumbnail) {
        this.seq = seq;
        this.title = title;
        this.artists = artists;
        this.thumbnail = thumbnail;
    }
}
