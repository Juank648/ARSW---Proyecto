package edu.eci.arsw.project.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="topics")
public class Topic {
    @Id
    @Column(name = "name")
    public String name;
    @OneToMany(mappedBy = "topics")
    private HashSet<Question> topics = new HashSet<>();;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
