package djs.team2.hotelApp.repository;


import djs.team2.hotelApp.model.Room;

import java.util.List;

public interface RoomRepository {

    Room getRoomById(long id);
    List<Room> getAllRooms();
    Room createRoom(Room room);
    Room removeRoom(Room room);
    Room editRoom(Room room);

    List<Room> needsToCleaningRooms();
}

