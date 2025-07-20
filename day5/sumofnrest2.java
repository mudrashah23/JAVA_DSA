// sum of power of n rest 2
package day5;

public class sumofnrest2 {
    public static void main(String[] args) {
        int number; // Example number
        int sum = 0;
         // Power to which each number is raised
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += i * i; // Raise each number to the power of 2 and add to sum
        }
        System.out.println(sum);
        
    }
}

