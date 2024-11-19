package mediumtasks;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 2, b = 2;

        for (long i = 2; i <= n; i++) {
            long hasil = 1;
            for (long j = i; j <= n; j++) {
                hasil *= j;
                if (hasil == n) {
                    a = i;
                    b = j;
                    System.out.println(a + " " + b);
                    return;
                }
                if (hasil > n) {
                    break;
                }
            }
        }
    }
}






