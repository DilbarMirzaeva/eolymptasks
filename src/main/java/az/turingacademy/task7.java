package az.turingacademy;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 12 || a <= 0) {
            System.out.println("invalid");
            return;
        } else if (a == 12 || a == 1 || a==2) {
            System.out.println("winter");
        } else if (a >= 3 && a < 6) {
            System.out.println("spring");
        } else if (a >= 6 && a < 9) {
            System.out.println("summer");
        } else {
            System.out.println("autumn");
        }
    }
}
