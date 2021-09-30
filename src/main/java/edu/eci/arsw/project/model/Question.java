package edu.eci.arsw.project.model;

import java.util.List;

public class Question {
    public String description;
    public Theme theme;
    public List<Options> options;

    public Question() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Theme getTema() {
        return theme;
    }

    public void associatedtheme(Theme theme) {
        this.theme = theme;
    }

    public List<Options> getRespuestas() {
        return options;
    }

    public void setRespuestas(List<Options> options) {
        this.options = options;
    }
}
