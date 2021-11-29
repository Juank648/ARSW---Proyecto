package edu.eci.arsw.project.service;

import edu.eci.arsw.project.model.Player;
import edu.eci.arsw.project.model.Room;
import edu.eci.arsw.project.model.Topic;
import edu.eci.arsw.project.persistence.impl.CreatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("creatorService")
public class CreatorService {
    @Autowired
    @Qualifier("creatorServiceImpl")
    CreatorServiceImpl creatorService;

    public Room createRoom(String name, List<Topic> topics, Integer idCreator) throws Exception{
        return creatorService.createRoom(name, topics, idCreator);
    }

    public Room getRoom(String name){
        return creatorService.getRoom(name);
    }
    public Iterable<Player> getPlayersInRoom(){
        return creatorService.getPlayersInRoom();
    }
    public Iterable<Topic> getAllTopics(){
        return creatorService.getAllTopics();
    }


}
