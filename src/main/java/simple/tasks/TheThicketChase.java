package simple.tasks;

import java.util.Scanner;

public class TheThicketChase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ticket = sc.nextInt();
        int people = 0;
        int m = ticket;
        for (int i = 1; i < N; i++) {
            m++;
        }

        for (int i = ticket + 1; i <= m; i++) {
            int k = 1;
            int say = 0;

            while (k <= i) {
                if (i % k == 0) {
                    say++;
                }
                k++;
            }

            if (say == 2) {
                break;
            } else {
                people++;
            }

        }

        if (people != 0 && people != N - 1) {
            System.out.println(people);
        } else {
            System.out.println("-1");
        }
    }
}
