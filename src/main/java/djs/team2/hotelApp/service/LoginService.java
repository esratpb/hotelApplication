package djs.team2.hotelApp.service;

import djs.team2.hotelApp.model.Login;
import org.springframework.stereotype.Service;

public interface LoginService {
    Login getLoginByName(String uName);
    boolean checkLogin(String uName, String uPass);
}
