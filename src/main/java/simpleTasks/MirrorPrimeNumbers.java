package simpleTasks;

import java.util.Scanner;

public class MirrorPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count=0;
        for (int i = a; i <=b; i++) {
            boolean m=check(i);
            boolean n=check(reverse(i));
            if(m==true && n==true){
                count++;
            }
        }
        System.out.println(count);

    }

    public static int reverse(int a){
        int reverse=0;
        int b;
        while (a>0){
            b=a%10;
            reverse=(reverse*10)+b;
            a=a/10;
        }return reverse;
    }

    public static boolean check(int b){
        boolean bool=true;
        int k=1;
        int say=0;
        while(k<=b){
            if(b%k==0){
                say++;
            }k++;
        }if(say==2){
            return bool;
        }else{
            bool=false;
            return bool;
        }
    }
}
