package edu.eci.arsw.project.model;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class HandleId implements Serializable {
    private static final long serialVersionUID = 7679534286539250742L;
    @Column(name = "coderoom", nullable = false)
    private Integer coderoom;
    @Column(name = "topic", nullable = false, length = 15)
    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Integer getCoderoom() {
        return coderoom;
    }

    public void setCoderoom(Integer coderoom) {
        this.coderoom = coderoom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coderoom, topic);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        HandleId entity = (HandleId) o;
        return Objects.equals(this.coderoom, entity.coderoom) &&
                Objects.equals(this.topic, entity.topic);
    }
}