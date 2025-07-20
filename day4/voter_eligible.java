package day4;
import java.util.Scanner;
public class voter_eligible {
    public static void main(String[] args) {
        int age; // Example age
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        
        scanner.close();
    }
}
