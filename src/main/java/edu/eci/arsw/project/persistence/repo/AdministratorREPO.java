package edu.eci.arsw.project.persistence.repo;

import edu.eci.arsw.project.model.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorREPO extends JpaRepository<Administrator, Integer> {

}
