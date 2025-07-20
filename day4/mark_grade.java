package day4;
import java.lang.*;
import java.util.Scanner;
public class mark_grade {
    public static void main(String[] args) {
        int marks ; // Example marks
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        marks = scanner.nextInt();


        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else if (marks >= 50) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
