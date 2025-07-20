package day5;
import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        int number; // Example number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }    
        System.out.println(sum);
}
}
