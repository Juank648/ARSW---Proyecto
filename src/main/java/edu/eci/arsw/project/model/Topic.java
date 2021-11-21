package edu.eci.arsw.project.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="topics")
public class Topic {

    @Id
    @Column(name = "name", nullable = false, length = 15)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
