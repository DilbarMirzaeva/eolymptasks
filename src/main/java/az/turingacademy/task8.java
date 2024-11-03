package az.turingacademy;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cem=0;
        while(a>0){
            cem+=a%10;
            a=a/10;
        }
        System.out.println(Math.sqrt(cem));
    }
}
