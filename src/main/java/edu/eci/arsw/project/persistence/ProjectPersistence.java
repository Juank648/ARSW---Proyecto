package edu.eci.arsw.project.persistence;

import edu.eci.arsw.project.model.User;

public interface ProjectPersistence{

    public Iterable<User> getAllUsers();
    public User getUserByNickname(String nickname);
}
