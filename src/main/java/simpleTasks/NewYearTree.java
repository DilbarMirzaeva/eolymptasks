package simpleTasks;

import java.util.Scanner;

public class NewYearTree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        long h=k;
        if((k==1 && n>1) || (k==2 && n%2!=0 && n>1) ){
            System.out.println("-1");
            return;
        }if(n==1 && k>=1){
            System.out.println(k);
            return;
        }
        for (int i = 0; i < n-1; i++) {
            h*=(k-1);
        }
        System.out.println(h);
    }
}
