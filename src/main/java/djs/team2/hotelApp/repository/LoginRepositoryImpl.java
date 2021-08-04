package djs.team2.hotelApp.repository;

import djs.team2.hotelApp.model.Login;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoginRepositoryImpl implements LoginRepository {
    List<Login> logins = new ArrayList<>();
    
    public LoginRepositoryImpl() {
        logins.add(new Login("admin", "123"));
        logins.add(new Login("user", "000"));
    }
    
    @Override
    public Login getLoginByName(String uName) {
        for (Login login : logins) {
            if (login.getuName().equals(uName)) {
                return login;
            }
        }
        return null;
    }
}
