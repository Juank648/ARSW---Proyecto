package edu.eci.arsw.project.model;


import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name ="users")
public class User{

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && nickname.equals(user.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
