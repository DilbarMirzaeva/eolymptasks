package az.turingacademy;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        long money=0;
        long N=0;
        long bank=money;
        while(true){
            N++;
            money=money*2+N;
            bank+=money;
            if(bank>=S){
                System.out.println(N);
                return;
            }
        }
    }
}
