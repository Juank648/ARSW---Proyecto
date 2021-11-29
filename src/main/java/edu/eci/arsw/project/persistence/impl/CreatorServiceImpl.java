package edu.eci.arsw.project.persistence.impl;

import edu.eci.arsw.project.exception.CustomeFieldValidationException;
import edu.eci.arsw.project.model.*;
import edu.eci.arsw.project.persistence.CreatorPersistence;
import edu.eci.arsw.project.persistence.repo.HandleREPO;
import edu.eci.arsw.project.persistence.repo.RoomREPO;
import edu.eci.arsw.project.persistence.repo.TopicREPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("creatorServiceImpl")
public class CreatorServiceImpl implements CreatorPersistence {
    @Autowired
    @Qualifier("roomRepository")
    RoomREPO  roomRepository;

    @Autowired
    @Qualifier("handleRepository")
    HandleREPO handleRepository;

    @Autowired
    @Qualifier("topicRepository")
    TopicREPO topicRepository;

    @Override
    public Room createRoom(String name, List<Topic> topics, Integer idCreator) throws Exception{
        Room newRoom = new Room();
        newRoom.setName(name);
        newRoom.setMoney(0);
        newRoom.setBank(0);
        newRoom.setTime(15);
        if(checkNameAvailable(name)){
            newRoom = roomRepository.save(newRoom);
            Integer roomID = newRoom.getId();
            for(int i = 0; i<topics.size();i++){
                String topic = topics.get(i).getId();
                Handle handle = new Handle();
                HandleId handleid = new HandleId();
                handleid.setCoderoom(roomID);
                handleid.setTopic(topic);
                handle.setId(handleid);
                handle = handleRepository.save(handle);
            }
        }
        return newRoom;

    }
    private boolean checkNameAvailable(String name) throws Exception {
        Optional<Room> roomFound = roomRepository.findByName(name);
        if (roomFound.isPresent()) {
            throw new CustomeFieldValidationException("Username no disponible","username");
        }
        return true;
    }

    @Override
    public Room getRoom(String name) {
        return null;
    }

    @Override
    public Iterable<Player> getPlayersInRoom() {
        return null;
    }

    @Override
    public Iterable<Topic> getAllTopics() {
        return topicRepository.getAllByIdIsNotNull();
    }
}
