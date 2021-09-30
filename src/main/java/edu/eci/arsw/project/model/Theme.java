package edu.eci.arsw.project.model;

import java.util.List;

public class Theme {
    public String name;
    public List<Question> questions;

    public Theme() {
    }
    public List<Question> getPreguntas() {
        return questions;
    }

    public void setPreguntas(List<Question> questions) {
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
