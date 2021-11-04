package edu.eci.arsw.project.service;


import edu.eci.arsw.project.model.User;
import edu.eci.arsw.project.persistence.Conexion;
import edu.eci.arsw.project.persistence.ProjectPersistence;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

     private static SessionFactory factory = Conexion.getEntityManagerFactory();

    /*
     public Iterable<User> getAllUsers() {
        return projectPersistence.getAllUsers();
    }*/
	
}