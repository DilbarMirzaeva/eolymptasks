package mediumTasks;

import java.util.Scanner;

public class SumDivisibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long n = 2;
        if (k <= 0) {
            return;
        }
        while (true) {
            if (method(n, k)) {
                break;
            }
            n++;
        }
        System.out.println(n);
    }

    public static boolean method(long n, long k) {
        long sum = (n * (n + 1)) / 2;
        return sum % k == 0;
    }
}