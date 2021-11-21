package edu.eci.arsw.project.model;


import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name ="users")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nickname", nullable = false, length = 20)
    private String nickname;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
