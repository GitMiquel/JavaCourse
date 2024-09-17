package chapter8;

/*
The password must be at least eight characters long,
contain an uppercase letter,
contain a special character,
not contain the username and
not be the same as the old password.
 */

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static final int passwordLength = 8;
    public static String username;
    public static String oldPassword;
    public static String newPassword;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Enter your username:");
        username = scanner.next();

        System.out.println("Enter your password:");
        oldPassword = scanner.next();

        System.out.println("Your password has expired. Enter your new password:");
        newPassword = scanner.next();
        scanner.close();

        if (passwordCheck(username, oldPassword, newPassword)){
            System.out.println("Your new password is valid");
        } else {
            System.out.println("""
                    Error. Your new password is not valid.
                    The password must be at least eight characters long.
                    Contain an uppercase letter.
                    Contain a special character.
                    Not contain the username and
                    Not be the same as the old password.""");
        }
    }

    public static boolean passwordCheck(String username, String oldPassword, String newPassword){

        Pattern upperCase = Pattern.compile("[A-Z]");
        Matcher UppercaseMatcher = upperCase.matcher(newPassword);

        Pattern specialCharacters = Pattern.compile("[^a-zA-Z0-9]");
        Matcher specialCharactersMatcher = specialCharacters.matcher(newPassword);

        boolean valid = true;

        if(Objects.equals(newPassword, oldPassword)){
            valid = false;
        } else if (newPassword.contains(username)){
            valid = false;
        } else if (!UppercaseMatcher.find()){
            valid = false;
        } else if (newPassword.length() < passwordLength){
            valid = false;
        } else if (!specialCharactersMatcher.find()) {
            valid = false;
        }

        return valid;
    }


}
