package simpleTasks;

import java.util.Scanner;

public class HowManyTimesRepeat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int repeat=0;
        while(n>0){
            repeat++;
            n=n-SumMethod(n);
        }
        System.out.println(repeat);
    }
    public static int SumMethod(int a){
        int sum=0;
        int num;
        while(a>0){
            num=a%10;
            sum+=num;
            a/=10;
        }
        return sum;
    }


}
