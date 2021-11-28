package edu.eci.arsw.project.persistence.repo;


import edu.eci.arsw.project.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicREPO extends JpaRepository<Topic, Integer> {
    public Iterable<Topic> getAllByIdIsNotNull();
}
