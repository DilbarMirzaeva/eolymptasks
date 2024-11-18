package mediumtasks;

import java.util.Scanner;

public class MatchsModel {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=(n*12)-((n-1)*4);
        System.out.println(b);
    }
}
