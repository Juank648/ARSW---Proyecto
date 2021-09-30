package edu.eci.arsw.project.model;

public class User {
    public String role;
    public String nickname;

    public User(String role, String nickname) {
        this.role = role;
        this.nickname = nickname;
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
}
