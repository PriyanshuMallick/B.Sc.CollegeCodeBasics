// Suppose a valid computer password consist of 8 characters
// The fisrt of which is a digit 1, 3 or 5. and the rest 7 characters are either english alphabets or digits

import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String message) {
        super(message);
    }
}

public class PasswordAuthenticator {

    static void validatePassword(String password) throws InvalidPasswordException {
        int validPasswordLength = 8;

        // Check password length

        if (password.length() != validPasswordLength) {
            throw new InvalidPasswordException("Password must be 8 characters long");
        }

        int F = 0;

        // Check first character of password

        char firstChar[] = { '1', '3', '5' };

        for (char i : firstChar) {

            if (password.charAt(0) == i) {
                F = 1;
                break;
            }
        }

        if (F == 0) {
            throw new InvalidPasswordException("First character must be the digit 1, 3, 5");
        }

        // Check rest of the password

        for (int i = 1; i < validPasswordLength; i++) {

            byte uni = (byte) password.charAt(i);

            if (uni >= 48 && uni <= 57 // 0 - 9
                    || uni >= 65 && uni <= 90 // A - Z
                    || uni >= 97 && uni <= 122) // a - z
            {
                continue;
            }

            throw new InvalidPasswordException("Last 7 characters must be either english alphabets or digits");
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter your Password :\n");
        String password = cin.nextLine();

        cin.close();

        try {
            validatePassword(password);
            System.out.println("\nYour password is correct");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password : " + e);
        }
    }
}
