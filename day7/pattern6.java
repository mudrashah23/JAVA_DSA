package day7;

public class pattern6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
              char ch = (char) ('A' + j - 1);
                System.out.print(ch+" ");
  
}
            System.out.println();
        }
    }
}