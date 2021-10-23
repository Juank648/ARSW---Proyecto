package edu.eci.arsw.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="players")
public class Player extends User {
    @Column
    public int totalScore;

    public Player(String nickname) {
        super(nickname);
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

    @Override
    public String toString() {
        return "Player{" +
                "totalScore=" + totalScore +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Player player = (Player) o;
        return totalScore == player.totalScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalScore);
    }
}
