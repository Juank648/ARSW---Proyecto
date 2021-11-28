package edu.eci.arsw.project.persistence;

import edu.eci.arsw.project.model.Player;
import edu.eci.arsw.project.model.Room;
import edu.eci.arsw.project.model.Topic;

import java.util.List;

public interface CreatorPersistence {
    Room createRoom(String name, List<Topic> topics, Integer idCreator) throws Exception;
    Room getRoom(String name);
    Iterable<Player> getPlayersInRoom();
    Iterable<Topic> getAllTopics();


}
