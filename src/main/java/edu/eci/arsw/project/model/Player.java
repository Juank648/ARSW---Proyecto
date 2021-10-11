package edu.eci.arsw.project.model;

public class Player extends User {
    public int score;

    public Player(String role, String nickname) {
        super(role, nickname);
    }

    public void makeEliminationVote(String player){

    };
    public void changeScore(int quantity){

    };
    public void voteBankOption() {

    };

    public int getScore() {
        return score;
    }
}
