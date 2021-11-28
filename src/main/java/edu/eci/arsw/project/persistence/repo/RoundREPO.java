package edu.eci.arsw.project.persistence.repo;


import edu.eci.arsw.project.model.Round;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoundREPO extends JpaRepository<Round, Integer> {
}
