package simpleTasks;

import java.util.Scanner;

public class SumAndAmount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            for (String num : numbers) {
                sum += (int) Integer.parseInt(num);
                count++;
            }

        }
        System.out.println(count + " " + sum);

    }
}
