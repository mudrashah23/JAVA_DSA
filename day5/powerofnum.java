package day5;
import java.util.Scanner;
public class powerofnum {
    public static void main(String[] args) {
        int num ; // Example base
        int pow;
        // Example exponent
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        num = scanner.nextInt();
        System.out.print("Enter the pow number: ");
        pow = scanner.nextInt();
        int n = num ; 

        for(int i=1 ; i<pow ; i++) {
            num = num * n;

       }
       System.out.println(num);
      }
        
  
}
