package edu.eci.arsw.project.persistence.repo;


import edu.eci.arsw.project.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectREPO extends JpaRepository<Project, Integer> {
}
