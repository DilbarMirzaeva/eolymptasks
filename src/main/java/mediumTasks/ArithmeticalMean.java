package mediumTasks;

import java.util.Scanner;

public class ArithmeticalMean {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a;
        double average = 0;
        int count = 0;
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            for (String num : numbers) {
                average += (double) Integer.parseInt(num);
                count++;
            }
            average /= count;
        }
        System.out.printf("%.4f", average);

    }
}
