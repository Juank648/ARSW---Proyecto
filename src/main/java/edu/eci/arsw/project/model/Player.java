package edu.eci.arsw.project.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="players")
public class Player extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id1;

    @ManyToOne(optional = false)
    @JoinColumn(name = "nickname", nullable = false)
    private User nickname1;

    @Column(nullable = false)
    private Integer totalscore;

    public Integer getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }

    public User getNickname1() {
        return nickname1;
    }

    public void setNickname1(User nickname1) {
        this.nickname1 = nickname1;
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }
}
