package djs.team2.hotelApp.service;

import djs.team2.hotelApp.model.Login;
import djs.team2.hotelApp.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    LoginRepository loginRepository;

    public LoginServiceImpl(){}

    @Autowired
    public LoginServiceImpl( LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    @Override
    public Login getLoginByName(String uName) {
        Login login = loginRepository.getLoginByName(uName);
        return login;
    }

    @Override
    public boolean checkLogin(String uName, String uPass) {
        if(loginRepository.getLoginByName(uName).uPass.equals(uPass))
            return true;
        else
            return false;
    }

}
