package day4;
import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        char ch; // Example character
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
        
        scanner.close();
    }
}
