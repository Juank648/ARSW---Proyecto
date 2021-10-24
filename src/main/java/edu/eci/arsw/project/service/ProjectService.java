package edu.eci.arsw.project.service;


import edu.eci.arsw.project.model.User;
import edu.eci.arsw.project.persistence.ProjectPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
     ProjectPersistence projectPersistence = null;

    public Iterable<User> getAllUsers() {
        return projectPersistence.getAllUsers();
    }
	
}