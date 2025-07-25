package day5;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
      {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1;
        System.out.println("Fibonacci sequence:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
      }
        
}
