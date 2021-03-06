package edu.eci.arsw.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rounds")
public class Round {

    @Id
    @Column(name = "number", nullable = false)
    private Integer id;

    @Id
    @Column(name = "coderoom", nullable = false)
    private Integer id1;

    @Column(name = "eliminatedplayer")
    private Integer eliminatedplayer;

    public Integer getEliminatedplayer() {
        return eliminatedplayer;
    }

    public void setEliminatedplayer(Integer eliminatedplayer) {
        this.eliminatedplayer = eliminatedplayer;
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
