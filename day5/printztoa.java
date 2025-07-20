package day5;

public class printztoa {
    public static void main(String[] args) {
        char start = 'Z'; // Starting character
        char end = 'A';   // Ending character
        char Start = 'z';
        char End = 'a';

        for (char ch = start; ch >= end; ch--) {
            System.out.print(ch + " ");
        }
        for (char ch = Start; ch >= End; ch--) {
            System.out.print(ch + " ");
        }
    }
  
}
