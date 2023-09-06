package Lecture11_hw;

public class WrongLoginException extends Exception{

    private String wrongLogin;
    public WrongLoginException(String message){
        super(message);
        this.wrongLogin = wrongLogin;
    }

    public String getWrongLogin() {
        return "(nothing) ";
    }

    public void setWrongLogin(String wrongLogin) {
        this.wrongLogin = wrongLogin;
    }
}
