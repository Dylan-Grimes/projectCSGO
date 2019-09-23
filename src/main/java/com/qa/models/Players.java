package com.qa.models;

import javax.persistence.*;

@Entity
@Table()
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String playerName;
    Double playerRank;
    String playerRole;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Double getPlayerRank() {
        return playerRank;
    }

    public void setPlayerRank(Double playerRank) {
        this.playerRank = playerRank;
    }

    public String getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(String playerRole) {
        this.playerRole = playerRole;
    }


    public void updateAll(Players player){
        this.playerName = player.getPlayerName();
        this.playerRank = player.getPlayerRank();
        this.playerRole = player.getPlayerRole();
    }
}

