package edu.eci.arsw.project.persistence.repo;

import edu.eci.arsw.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Set;

@Repository
public interface UserREPO extends JpaRepository<User, Integer> {
    public Set<User> findByNickname(String nickname);

}
