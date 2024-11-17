package simple.tasks;

import java.util.Scanner;

public class digitsApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int s = 0;
        if (n == 0) {
            s = 1;
        } else {
            while (n > 0) {
                s++;
                n /= 10;
            }
        }
        System.out.println(s);

    }
}
