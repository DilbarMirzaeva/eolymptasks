package simpleTasks;

import java.util.Scanner;

public class Gardener {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double sum=0.0;
        int s=0;
        while(sum<=0.5){
            sum=sum+1.0/(N - s);
            s++;
        }
        int K=N-s;
        System.out.println(K+1);
    }
}
