package day4;
import java.util.Scanner;

public class positive_negitive {
    public static void main(String[] args) {
        int number; // Example number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        scanner.close();
    }
}
