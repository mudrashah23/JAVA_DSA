package day6;

public class pettern10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print characters from 'A' to 'E'
            for (int j = 1; j <= 6; j++) {
                char ch = (char) ('F' + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
  
}
