package com.lambda.web.PlayerEntity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@Entity(name="Player")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerId;

    private String playerName, ePlayerName, nickname, joinYyyy, position, backNo, nation, birthDate, solar,
            height, weight, teamId;
    @Builder
    public Player(String playerName, String ePlayerName, String nickname, String joinYyyy, String position, String backNo, String nation, String birthDate,
                  String solar, String height, String weight, String teamId){
        this.playerName = playerName;
        this.ePlayerName = ePlayerName;
        this.nickname = nickname;
        this.joinYyyy = joinYyyy;
        this.position = position;
        this.backNo = backNo;
        this.nation = nation;
        this.birthDate = birthDate;
        this.solar = solar;
        this.height = height;
        this.weight = weight;
        this.teamId = teamId;

    }
}
