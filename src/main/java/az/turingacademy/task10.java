package az.turingacademy;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 1 || N > 12) {
            System.out.println("false");
        } else if (N >= 1 && N < 4) {
            System.out.println("First");
        } else if (N > 3 && N < 7) {
            System.out.println("Second");
        } else if (N > 6 && N < 9) {
            System.out.println("Third");
        } else {
            System.out.println("Fourth");
        }

    }
}
