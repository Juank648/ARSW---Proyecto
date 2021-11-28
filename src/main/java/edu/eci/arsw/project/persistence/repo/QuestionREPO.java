package edu.eci.arsw.project.persistence.repo;


import edu.eci.arsw.project.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionREPO extends JpaRepository<Question, Integer> {
}
