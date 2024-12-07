package simpleTasks;

import java.util.Scanner;

public class Function4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long f = (long) (1 + x + x * x);
        System.out.println(f);

    }
}
