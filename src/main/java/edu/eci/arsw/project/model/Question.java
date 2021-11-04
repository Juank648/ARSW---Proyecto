package edu.eci.arsw.project.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name ="questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    @OneToMany(mappedBy = "questions")
    private HashSet<Options> options = new HashSet<>();;
    @Column
    public String question;
    @ManyToOne
    @JoinColumn(name = "topic")//Revisar nombre, según ejemplo va el nombre del PK de Topic
    private Topic topic;

}
