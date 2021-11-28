package edu.eci.arsw.project.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "handle")
@Entity
public class Handle {
    @EmbeddedId
    private HandleId id;

    public HandleId getId() {
        return id;
    }

    public void setId(HandleId id) {
        this.id = id;
    }
}