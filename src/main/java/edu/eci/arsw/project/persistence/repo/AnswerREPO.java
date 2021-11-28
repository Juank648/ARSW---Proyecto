package edu.eci.arsw.project.persistence.repo;

import edu.eci.arsw.project.model.Administrator;
import edu.eci.arsw.project.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerREPO extends JpaRepository<Answer, Integer> {
}
