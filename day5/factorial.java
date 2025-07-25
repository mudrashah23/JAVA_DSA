package day5;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int number; // Example number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i; // Calculate factorial
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
