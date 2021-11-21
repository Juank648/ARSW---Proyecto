package edu.eci.arsw.project.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="options")
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idquestion", nullable = false)
    private Question idquestion;

    @Column(name = "option", nullable = false, length = 100)
    private String option;

    @Column(name = "correct", nullable = false)
    private Boolean correct = false;

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public Question getIdquestion() {
        return idquestion;
    }

    public void setIdquestion(Question idquestion) {
        this.idquestion = idquestion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
