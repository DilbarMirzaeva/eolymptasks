package az.turingacademy;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<10 || a>99){
            System.out.println("false");
            return;
        }
        System.out.println(a / 10 + " " + a % 10);
    }
}
