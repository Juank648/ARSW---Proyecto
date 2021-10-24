package edu.eci.arsw.project.persistence.repo;

import edu.eci.arsw.project.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerREPO extends CrudRepository <Player, Integer> {
}
