package simpleTasks;

import java.util.Scanner;

public class ValueOfVariable4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y=((2*x-1)/Math.pow(x,2))+Math.sqrt(Math.pow(x,2)+1)/2;
        System.out.printf("%.3f",y);
    }
}
