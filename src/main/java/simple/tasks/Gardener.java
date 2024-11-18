package simple.tasks;

import java.util.Scanner;

public class Gardener {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int num=N;
        double sum=0;
        int K=0;
        while(sum>0.5){
            sum=sum+(1.0/num);
            num--;
            K++;
    }
        System.out.println(N-K-1);
    }
}
