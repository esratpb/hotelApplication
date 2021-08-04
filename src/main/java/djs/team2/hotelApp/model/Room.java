package djs.team2.hotelApp.model;

public class Room {
    private int roomId;
    private String roomType;
    private int roomSize;
    private double roomPrice;
    private String roomFacilities;
    private Boolean roomNeedsCleaning;

    public Room(int roomId, String roomType, int roomSize, double roomPrice, String roomFacilities, Boolean roomNeedsCleaning) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomSize = roomSize;
        this.roomPrice = roomPrice;
        this.roomFacilities = roomFacilities;
        this.roomNeedsCleaning = roomNeedsCleaning;
    }

    public Room() {

    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomFacilities() {
        return roomFacilities;
    }

    public void setRoomFacilities(String roomFacilities) {
        this.roomFacilities = roomFacilities;
    }

    public Boolean getRoomNeedsCleaning() {
        return roomNeedsCleaning;
    }

    public void setRoomNeedsCleaning(Boolean roomNeedsCleaning) {
        this.roomNeedsCleaning = roomNeedsCleaning;
    }
}
