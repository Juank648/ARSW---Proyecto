package edu.eci.arsw.project.model;

import java.util.List;

public class Room {
    public String name;
    public List<Player> players;
    public User manager;
    public List<Theme> themes;

    public void addPlayer() {

    };
    public void setManager(User manager){
      this.manager = manager;
    };
}
