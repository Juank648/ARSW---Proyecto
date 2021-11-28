package edu.eci.arsw.project.persistence.repo;


import edu.eci.arsw.project.model.Handle;
import edu.eci.arsw.project.model.HandleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HandleREPO extends JpaRepository<Handle, HandleId> {

}
