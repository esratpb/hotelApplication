package djs.team2.hotelApp.service;


import djs.team2.hotelApp.model.Room;

import java.util.List;

public interface RoomService {

     Room getRoomById(long id);
     List<Room> getAllRooms();
     Room createRoom( Room room);
     Room removeRoom( long id);
     Room editRoom(long id);

    List<Room> needsToCleaningRooms();
}
