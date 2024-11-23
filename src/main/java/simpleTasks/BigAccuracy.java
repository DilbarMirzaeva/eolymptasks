package simpleTasks;

import java.util.Scanner;

public class BigAccuracy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        short m = sc.nextShort();
        short n = sc.nextShort();
        short k = sc.nextShort();
        if (n == 0) {
            System.out.println("wrong");
        } else {
            float s = (float) m / n;
            System.out.printf("%." + k + "f\n", s);
        }

    }
}
