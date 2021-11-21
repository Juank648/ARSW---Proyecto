package edu.eci.arsw.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @Column(name = "idquestion", nullable = false)
    private Integer id;

    @Id
    @Column(name = "idplayer", nullable = false)
    private Integer id1;

    @Column(name = "correctanswer", nullable = false)
    private Boolean correctanswer = false;

    public Boolean getCorrectanswer() {
        return correctanswer;
    }

    public void setCorrectanswer(Boolean correctanswer) {
        this.correctanswer = correctanswer;
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
