package Lecture11_hw;

import java.util.Scanner;

/*Create a class with a static method. This method accepts three parameters for login:
login, password, confirmPassword. All fields have a String data type. Length
login must be less than 20 characters and must not contain spaces. If login is not
WrongLoginException must be discarded if it meets these requirements. Length
password must be less than 20 characters, must not contain a space and must
contain at least one digit. Also, password and confirmPassword must be equal.
If the password does not meet these requirements, it must be discarded
WrongPasswordException. WrongPasswordException and WrongLoginException -
custom exclusion classes with two constructors – one by default,
The second receives the exception message and transmits it to the Exception class designer.
The method returns true if the values are true, false otherwise.
 */
public class LoginApp {

    public static boolean acceptable(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (confirmLogin(login) && confirmInputPassword(password, confirmPassword)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your login details: ");
        String login = scanner.nextLine();
        System.out.println("Please input password: ");
        String password = scanner.nextLine();
        System.out.println("Please input your password again: ");
        String confirmPassword = scanner.nextLine();

        try
        {
            if (acceptable(login, password, confirmPassword) )
            {
                System.out.println("You successfully created an account and added details!");
            }
            else {
                throw new WrongPasswordException("Wrong Password Exception");
            }
        } catch(WrongPasswordException exception)
        {
            System.out.println("Invalid Password, message: " + exception.getMessage() + " invalid password " + exception.getWrongPassword());
        } catch (WrongLoginException exception)
        {
            System.out.println("Invalid Login, message:  " + exception.getMessage() + " invalid login " + exception.getWrongLogin());
        }
    }


    public static boolean confirmLogin(String login) throws WrongLoginException
    {
        if (login.length() >= 20 || login.contains(" "))
        {
            throw new WrongLoginException("""

                    possible reasons for that are:\s
                    1 - your login contains space.
                    2 - you login length is > 20.""");
        }
        return true;
    }

    public static boolean confirmInputPassword(String password, String confirmPassword) throws WrongPasswordException
    {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword))
        {
            throw new WrongPasswordException("""
                    possible reasons for that are:\s
                    1 - you password contains space.
                    2 - you password length is > 20.
                    3 - does not contain any number.
                    4 - your passwords do not match.
                    """);
        }
        return true;
    }
}

