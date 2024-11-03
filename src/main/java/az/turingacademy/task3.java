package az.turingacademy;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int yas=0;
        int money=1;
        int general=0;

        while(general<s){
            yas++;
            general+=money;
           money=money*2+yas;
        }
        System.out.println(yas);
    }
}
