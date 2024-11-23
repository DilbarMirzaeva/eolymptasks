package simpleTasks;

import java.util.Scanner;

public class PainterGardener {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int color = 3;
        long h = color;
        for (int i = 0; i < N - 1; i++) {
            h *= (color - 1);
        }
        System.out.println(h);
    }
}
