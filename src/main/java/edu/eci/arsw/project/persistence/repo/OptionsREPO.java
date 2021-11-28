package edu.eci.arsw.project.persistence.repo;


import edu.eci.arsw.project.model.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionsREPO extends JpaRepository<Options, Integer> {
}
