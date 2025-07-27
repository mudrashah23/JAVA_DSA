package day6;

public class pettern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print characters from 'A' to 'E'
            for (int j = 1; j <= 5; j++) {
                char ch = (char) ('A' + j - 1);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
  
}
