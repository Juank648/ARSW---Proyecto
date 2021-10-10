package edu.eci.arsw.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"edu.eci.arsw.project"})
public class APIApplication {
    public void main(String[] arg){
        SpringApplication.run(APIApplication.class, arg);

    }
}
