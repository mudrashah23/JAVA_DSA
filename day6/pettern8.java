//Alfhabetes Pattern
package day6;

public class pettern8 {
    public static void main(String[] args) {
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            // Print characters from 'A' to 'E'

            for (int j = 1; j <= 5; j++) {
                System.out.print(ch + " "); 
            }
            System.out.println();
            ch++;
        }
    }
  
}
