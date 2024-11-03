package az.turingacademy;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a <= b && a <= c) {
            int cvb = b <= c ? b : c;
            System.out.println(cvb);
        } else if (b <= a && b <= c) {
            int cvb = a <= c ? a : c;
            System.out.println(cvb);
        } else {
            System.out.println(c);
        }

    }
}

