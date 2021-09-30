package edu.eci.arsw.project.model;

public class Options {
    public String Description;
    public Question question;
    public Boolean correct;

    public Options(String description, Question question) {
        Description = description;
        this.question = question;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Question getPregunta() {
        return question;
    }

    public void setPregunta(Question question) {
        this.question = question;
    }

    public Boolean getIscorrect() {
        return correct;
    }

    public void setIscorrect(Boolean iscorrect) {
        this.correct = iscorrect;
    }
}
