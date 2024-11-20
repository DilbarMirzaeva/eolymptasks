package simple.tasks;

import java.util.Scanner;

public class NewYearTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int h=k;
        if((k==1 && n>1) || n>15 || k<1){
            System.out.println("-1");
            return;
        }if(k==1 && n==1){
            System.out.println("1");
            return;
        }
        for (int i = 0; i < n-1; i++) {
            h*=(k-1);
        }
        System.out.println(h);
    }
}
