package day4;
import java.util.Scanner;
public class bigger {
    public static void main(String[] args) {
        int num1, num2; // Example numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is bigger than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
        
        scanner.close();
    }

}
