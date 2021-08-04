package djs.team2.hotelApp.repository;

import djs.team2.hotelApp.model.Login;

public interface LoginRepository {
    Login getLoginByName(String uName);
}
