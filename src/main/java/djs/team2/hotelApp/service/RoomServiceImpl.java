package djs.team2.hotelApp.service;

import djs.team2.hotelApp.model.Room;
import djs.team2.hotelApp.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{

    RoomRepository roomRepository;

    public RoomServiceImpl(){}

    @Autowired
    public RoomServiceImpl( RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }

    @Override
    public Room getRoomById(long id) {
        Room room = roomRepository.getRoomById( id);
        return room;
    }

    @Override
    public List<Room> getAllRooms() {
        List<Room> rooms = roomRepository.getAllRooms();
        return rooms;
    }

    @Override
    public Room createRoom(Room room) {
        room = roomRepository.createRoom( room);
        return room;
    }

    @Override
    public Room removeRoom(long id) {
        Room room = roomRepository.removeRoom(getRoomById(id));
        return room;
    }

    public Room editRoom(long id) {
        Room room = roomRepository.editRoom(getRoomById(id));
        return room;
    }

    @Override
    public List<Room> needsToCleaningRooms() {
        List<Room> rooms=roomRepository.needsToCleaningRooms();
        return rooms;
    }
}
