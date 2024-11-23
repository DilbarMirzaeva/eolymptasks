package simpleTasks;

import java.util.Scanner;

public class CycleShift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//11
        String str=Integer.toBinaryString(N);//1011
        for (int i = 1; i <= str.length(); i++) {
            str=str.substring(1)+str.charAt(0);
            int num=Integer.parseInt(str,2);

            if(num>N){
                N=num;
            }
        }
        System.out.println(N);
    }
}
