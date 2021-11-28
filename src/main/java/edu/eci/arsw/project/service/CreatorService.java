package edu.eci.arsw.project.service;

import edu.eci.arsw.project.model.Player;
import edu.eci.arsw.project.model.Room;
import edu.eci.arsw.project.model.Topic;
import edu.eci.arsw.project.persistence.impl.CreatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("creatorService")
public class CreatorService {
    @Autowired
    CreatorServiceImpl service;

    public Room createRoom(String name, List<Topic> topics, Integer idCreator) throws Exception{
        return service.createRoom(name, topics, idCreator);
    }

    public Room getRoom(String name){
        return service.getRoom(name);
    }
    public Iterable<Player> getPlayersInRoom(){
        return service.getPlayersInRoom();
    }
    public Iterable<Topic> getAllTopics(){
        return service.getAllTopics();
    }


}
