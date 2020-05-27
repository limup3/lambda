package com.lambda.web.soccer;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="schedule")
public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheNo;

    @Column(length = 10) private String scheDate;
    @Column(length = 10) private String stadiumId;
    @Column(length = 10) private String gubun;
    @Column(length = 10) private String hometeamId;
    @Column(length = 10) private String awayteamId;
    @Column(length = 10) private String homeScore;
    @Column(length = 10) private String awayScore;

    @Builder
    public Schedule(String scheDate, String stadiumId, String gubun, String hometeamId, String awayteamId, String homeScore, String awayScore) {
        this.scheDate = scheDate;
        this.stadiumId = stadiumId;
        this.gubun = gubun;
        this.hometeamId = hometeamId;
        this.awayteamId = awayteamId;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
}