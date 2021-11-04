package edu.eci.arsw.projectapi;

import edu.eci.arsw.project.persistence.StoreData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;


@SpringBootApplication
//@ComponentScan(basePackages = {"edu.eci.arsw.project"})
//@EntityScan("edu.eci.arsw.project.model")
//@EnableJpaRepositories("edu.eci.arsw.project.persistence.repo")
public class ProjectAPIApplication {

    public static void main(String[] args) {
        StoreData.makeBD();
        SpringApplication.run(ProjectAPIApplication.class, args);
    }
}