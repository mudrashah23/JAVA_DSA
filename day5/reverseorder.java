package day5;
import java.util.Scanner;
public class reverseorder {
    public static void main(String[] args) {
        int number; // Example number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (greater than 100): ");
        number = scanner.nextInt();
        if (number < 100) {
            System.out.println("Please enter a number greater than 100.");
            return;
        }
        for (int i = number; i >= 1; i--) {
            System.out.println(i + "\t");
        }
    }
}
