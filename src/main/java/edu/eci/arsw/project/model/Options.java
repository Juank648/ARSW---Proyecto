package edu.eci.arsw.project.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="options")
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Question idquestion;
    @Column
    public String option;
    @Column
    private boolean correct;

    public Options(Question question) {
        this.idquestion = question;
    }

    public Options() {

    }

    public int getId() {
        return id;
    }

    public Question getQuestion() {
        return idquestion;
    }

    public String getOption() {
        return option;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setQuestion(Question question) {
        this.idquestion = question;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Options{" +
                "id=" + id +
                ", question=" + idquestion +
                ", option='" + option + '\'' +
                ", correct=" + correct +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Options options = (Options) o;
        return id == options.id && correct == options.correct && idquestion.equals(options.idquestion) && option.equals(options.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idquestion, option, correct);
    }
}
