package hardTasks;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int reverseNum=reverse(x);
        System.out.println(reverseNum);
    }
    public static int reverse(int x) {
        int reverse=0;
        int b;int a;int c=-1;
        if(x<0){
            a=x*c;
        }else{a=x;}
        while (a>0){
            b=a%10;
            reverse=(reverse*10)+b;
            a=a/10;
        }if(x>0){
            return reverse;
        }else{
            reverse=c*reverse;
            return reverse;
        }
    }
}

