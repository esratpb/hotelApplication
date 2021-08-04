package djs.team2.hotelApp.controllers;

import djs.team2.hotelApp.model.Login;
import djs.team2.hotelApp.model.Message;
import djs.team2.hotelApp.service.LoginService;
import djs.team2.hotelApp.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {
    LoginService loginService;

    public LoginController() {
    }

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }


    @GetMapping(value = "/login", produces = "text/html")
    public String checkLogin(@RequestParam(value = "uName", required = false) String uName,
                            @RequestParam(value = "uPass", required = false) String uPass) {
        if(loginService.getLoginByName(uName).getuPass().equals(uPass))
            return "Welcome to the hotel reservation system";
        else
            return "Please correct your user name or password and try again";
    }
}
