package djs.team2.hotelApp.model;

public class Login {
    public String uName;
    public String uPass;

    public Login(){

    }

    public Login(String uName, String uPass) {
        this.uName = uName;
        this.uPass = uPass;
    }

    public String getuName() {
        return uName;
    }

    public String getuPass() {
        return uPass;
    }
}
