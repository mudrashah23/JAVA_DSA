package day5;
import java.util.Scanner;

public class prime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    if (number < 2) {
      System.out.println("Number is not prime.");
      return;
    
  }
  else {
    for(int i = 2; i< number; i++){
      if(number % i == 0) {
        System.out.println("Number is not prime.");
        return;
      
    }
  }
  
        System.out.println("Number is prime.");
  
}
    }
  }
