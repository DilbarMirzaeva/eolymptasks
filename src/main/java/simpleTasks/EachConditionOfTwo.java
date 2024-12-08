package simpleTasks;

import java.util.Scanner;

public class EachConditionOfTwo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(foo(n) && foo2(n)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean foo(int n){
        return n%3==0 && n%2==0;
    }
    public static boolean foo2(int n){
        n=Math.abs(n);
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count==2;
    }
}
