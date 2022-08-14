// 20. Write a program to create your own exception types to handle situation specific to your 
//  application (Hint: Define a subclass of Exception which itself is a subclass of Throwable).

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class $20_CustomExceptions {
    public static void validateAge(int age) throws AgeException {
        if (age < 0) {
            throw new AgeException("Age cannot be negetive");
        }

        else if (age >= 0 && age < 18) {
            throw new AgeException("You are still a kid");
        }

        else if (age > 30) {
            throw new AgeException("You are OLD!");
        }

        else {
            System.out.println("Try to be a good person in life");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(40);
        }

        catch (AgeException e) {
            System.out.println("Caught the exception\n");
            System.out.println("Exception occured: \n" + e);
        }

        System.out.println("\nEnd of program\nHave a good day\n");
    }
}