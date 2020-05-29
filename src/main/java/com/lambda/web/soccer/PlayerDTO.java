package com.lambda.web.soccer;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PlayerDTO {
    private String playerId;
    private String playerName;
    private String ePlayerName;
    private String nickname;
    private String joinYyyy;
    private String position;
    private String backNo;
    private String nation;
    private String birthDate;
    private String solar;
    private String height;
    private String weight;
}
