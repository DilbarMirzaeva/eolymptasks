package simpleTasks;

import java.util.Scanner;

public class ValuOfVariable5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = (2 * x) / (Math.sqrt(Math.pow(x, 2) + 1)) - (Math.sqrt(Math.pow(x, 2) + 1) / Math.pow(x, 3));
        System.out.printf("%.3f", y);
    }
}
