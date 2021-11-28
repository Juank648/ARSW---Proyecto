package edu.eci.arsw.project.service;


import edu.eci.arsw.project.persistence.Conexion;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

@Service("projectService")
public class ProjectService {

     private static SessionFactory factory = Conexion.getEntityManagerFactory();

    /*
     public Iterable<User> getAllUsers() {
        return projectPersistence.getAllUsers();
    }*/
	
}