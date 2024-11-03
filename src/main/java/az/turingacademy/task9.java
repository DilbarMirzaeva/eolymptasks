package az.turingacademy;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int last=a%10;
        int first=a/1000;
        System.out.println(last+first);
    }
}
