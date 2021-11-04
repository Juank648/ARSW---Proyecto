package edu.eci.arsw.project.persistence.impl;

import edu.eci.arsw.project.model.User;
import edu.eci.arsw.project.persistence.ProjectPersistence;
import edu.eci.arsw.project.persistence.repo.UserREPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements ProjectPersistence{
    /*
    @Autowired
    private UserREPO userREPO;
       */

    @Override
    public Iterable<User> getAllUsers() {
        System.out.println("<><><><><><><<><><><><><><><><><><><><><><");
        //System.out.println(userREPO.findAll());
        //return userREPO.findAll();
        return null;
    }

    @Override
    public User getUserByNickname(String nickname) {
        //return (User) userREPO.findByNickname(nickname);
        return null;
    }
}
