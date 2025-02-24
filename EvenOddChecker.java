import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Get integer input from the user
        int number = getIntegerInput();

        // Determine if it's even or odd
        String result = checkEvenOrOdd(number);

        // Display the result
        System.out.println(result);
    }

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        input.close();
        return number;
    }

    // Method to determine if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
