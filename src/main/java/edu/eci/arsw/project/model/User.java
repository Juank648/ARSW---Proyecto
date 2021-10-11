package edu.eci.arsw.project.model;


import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity(name = "users")
public class User {
    public int id;
    public String role;
    public String nickname;

    public User(String role, String nickname) {
        this.role = role;
        this.nickname = nickname;
    }

    public User() {

    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
