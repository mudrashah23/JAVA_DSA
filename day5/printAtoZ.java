package day5;

public class printAtoZ {
    public static void main(String[] args) {
        char start = 'A'; // Starting character //same work for 'a' for lowercase
        char end = 'Z';   // Ending character //same work for 'z' for lowercase
        char Start = 'a';
        char End = 'z';

        for (char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
        }
        for (char ch = Start; ch <= End; ch++) {
            System.out.print(ch + " ");
        }

    }
  
}
