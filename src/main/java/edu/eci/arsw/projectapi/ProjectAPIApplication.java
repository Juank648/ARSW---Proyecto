package edu.eci.arsw.projectapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw.project"})
public class ProjectAPIApplication {

    public static void main(String[] args){
        SpringApplication.run(ProjectAPIApplication.class, args);
    }
}
