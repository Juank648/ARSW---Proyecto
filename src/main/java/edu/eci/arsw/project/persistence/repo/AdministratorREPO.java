package edu.eci.arsw.project.persistence.repo;

import edu.eci.arsw.project.model.Administrator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorREPO extends CrudRepository<Administrator, Integer> {

}
