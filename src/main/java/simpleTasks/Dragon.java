package simpleTasks;

import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N;
        int dragonsay = 1;
        int centipedesay = 1;
        if (A < K || B < S) {
            System.out.println("-1");
            return;
        }
        if (K == 0) {
            System.out.println("-1");
            return;
        }

        if (A % K == 0) {
            dragonsay = (A - K) / K;
            centipedesay = K;
        } else {
            dragonsay = A / K;
            centipedesay = A % K;
        }

        N = (B - centipedesay * S) / dragonsay;
        System.out.println(N);
    }
}
