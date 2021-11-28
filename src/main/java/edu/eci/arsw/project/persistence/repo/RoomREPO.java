package edu.eci.arsw.project.persistence.repo;


import edu.eci.arsw.project.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomREPO extends JpaRepository<Room, Integer> {
    public Optional<Room> findByName(String name);

}
