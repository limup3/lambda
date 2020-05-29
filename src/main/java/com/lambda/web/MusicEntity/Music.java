package com.lambda.web.MusicEntity;

import lombok.*;
import javax.persistence.*;
@Data
@AllArgsConstructor
@Entity(name="Music")
//@NoArgsConstructor(access = AccessLevel.PUBLIC)

public class Music {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mbrNo;
//    @Column(length = 200, nullable =false)

    public Music(){}
    public Long getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(Long mbrNo) {
        this.mbrNo = mbrNo;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtists() {
        return artists;
    }

    public void setArtists(String artists) {
        this.artists = artists;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    private String seq, title, artists, thumbnail;

    @Builder
    public Music(String seq, String title, String artists, String thumbnail) {
        this.seq = seq;
        this.title = title;
        this.artists = artists;
        this.thumbnail = thumbnail;
    }
}
