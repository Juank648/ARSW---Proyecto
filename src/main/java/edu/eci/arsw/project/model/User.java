package edu.eci.arsw.project.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="users")
public class User {
    @Id
    public int id;
    @Column
    public String nickname;

    public User(String nickname) {
        this.nickname = nickname;
    }

    public User() {

    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }

}
