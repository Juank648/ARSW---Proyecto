package edu.eci.arsw.project.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player extends User {
    public int totalScore;

    public Player(String role, String nickname) {
        super(role, nickname);
    }

    public Player() {

        super();
    }

    public void makeEliminationVote(String player){

    };
    public void changeScore(int quantity){

    };
    public void voteBankOption() {

    };

    public int getScore() {
        return totalScore;
    }
}
