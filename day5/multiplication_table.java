package day5;
import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        int num; // Example base
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for multiplication table: ");
        num = scanner.nextInt();
      
        

        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
          int sum = num * i;
            System.out.println(num + " " + i + " " + sum);
        }
    }
}
