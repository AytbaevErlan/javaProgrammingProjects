package Lecture11_hw;

public class WrongPasswordException extends Exception {

    private String wrongPassword;

    public WrongPasswordException(String message){
        super(message);
    }


    public String getWrongPassword() {
        return " (nothing) ";
    }

    public void setWrongPassword() {
        this.wrongPassword = wrongPassword;
    }
}
