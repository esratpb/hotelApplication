package djs.team2.hotelApp.controllers;

import djs.team2.hotelApp.model.Message;
import djs.team2.hotelApp.model.Room;
import djs.team2.hotelApp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomController {

    RoomService roomService;

    public RoomController() {
    }

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "/room/{id}", produces = "application/json")
    public ResponseEntity<Room> getRoomById(@PathVariable(name = "id", required = true) long id) {
        Room room = roomService.getRoomById(id);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    @GetMapping(value = "/rooms", produces = "application/json")
    public ResponseEntity<List<Room>> getRooms() {
        List<Room> rooms = roomService.getAllRooms();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @PutMapping(value = "/room/add", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        room = roomService.createRoom(room);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    @PutMapping(value = "/room/edit/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Room> editRoom(@PathVariable(name = "id", required = true) long id) {
        Room room = roomService.editRoom(id);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

    @DeleteMapping(value = "/room/delete/{id}", produces = "application/json", consumes = "application/json")
    public ResponseEntity<Room> removeRoom(@PathVariable(name = "id", required = true) long id) {
        Room room = roomService.removeRoom(id);
//        return new ResponseEntity<>(room, HttpStatus.OK);
        return new ResponseEntity<>(room, HttpStatus.OK);
    }

//    @GetMapping(value = "/roombyid2", produces = "text/html")
//    public ResponseEntity<String> getRoomById2() {
//        return new ResponseEntity<>("<html><body><h2>Hello world!</body></html>", HttpStatus.OK);
//    }


// ## for cleaners page  ##
    @GetMapping(value = "/room/needscleaning",consumes = "application/json")
    public ResponseEntity<List<Room>> needsToCleaningRooms(){
       List<Room> rooms=roomService.needsToCleaningRooms ();
       return new ResponseEntity<>(rooms,HttpStatus.OK);
    }


}

