package com.lambda.web.Schedule;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity(name="Schedule")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Schedule {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stadium_id;

    private String scheDate, stadiumId, gubun, hometeamId, awayteamId, homeScore, awayScore;


}