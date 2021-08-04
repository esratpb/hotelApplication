package djs.team2.hotelApp.repository;

import djs.team2.hotelApp.model.Room;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class RoomRepositoryImpl implements RoomRepository {

    List<Room> rooms = new ArrayList<>();

    public RoomRepositoryImpl() {

        Room room = new Room();
        room.setRoomId(10);
        room.setRoomType("Economy");
        room.setRoomSize(5);
        room.setRoomPrice(30.00);
        room.setRoomFacilities("TV");
        room.setRoomNeedsCleaning(false);

        rooms.add(room);

        rooms.add(new Room(11, "Regular", 5, 45.00, "TV, Mini Bar", true));
        rooms.add(new Room(12, "Luxury", 25, 200.00, "TV, Mini Bar, Lake View", false));
        rooms.add(new Room(13, "Regular", 5, 45.00, "TV, Mini Bar", true));
        rooms.add(new Room(14, "Luxury", 25, 200.00, "TV, Mini Bar, Lake View", true));
        rooms.add(new Room(15, "Regular", 5, 45.00, "TV, Mini Bar", true));
        rooms.add(new Room(16, "Luxury", 25, 200.00, "TV, Mini Bar, Lake View", true));
        rooms.add(new Room(17, "Regular", 5, 45.00, "TV, Mini Bar", false));
        rooms.add(new Room(18, "Luxury", 25, 200.00, "TV, Mini Bar, Lake View", false));
        rooms.add(new Room(19, "Regular", 5, 45.00, "TV, Mini Bar", false));
        rooms.add(new Room(20, "Luxury", 25, 200.00, "TV, Mini Bar, Lake View", true));
        rooms.add(new Room(21, "Regular", 5, 45.00, "TV, Mini Bar", false));
        rooms.add(new Room(22, "Luxury", 25, 200.00, "TV, Mini Bar, Lake View", false));
    }

    @Override
    public Room getRoomById(long id) {
        for (Room room : rooms) {
            if (room.getRoomId() == id) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAllRooms() {
        return rooms;
    }

    @Override
    public Room createRoom(Room room) {
        rooms.add(room);
        return room;
    }

    @Override
    public Room removeRoom(Room room) {
        rooms.remove(room);
        return room;
    }

    @Override
    public Room editRoom(Room room) {
        rooms.set(getAllRooms().indexOf(room), room);
        return room;
    }

    @Override
    public List<Room> needsToCleaningRooms() {
        List<Room> roomList=new ArrayList<>();
        for(Room room1:rooms){
            if(room1.getRoomNeedsCleaning()){
                roomList.add(room1);
            }
        }
        return roomList;
    }
}
