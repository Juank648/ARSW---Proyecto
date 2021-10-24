package edu.eci.arsw.project.persistence.repo;

import edu.eci.arsw.project.model.Creator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreatorREPO extends CrudRepository <Creator, Integer>{
}
