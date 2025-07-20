package day4;
import java.util.Scanner;
public class divbyfour {
    public static void main(String[] args) {
        int number; // Example number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            } 
        }
      }
}
