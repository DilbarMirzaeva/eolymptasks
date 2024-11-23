package simpleTasks;

import java.util.Arrays;
import java.util.Scanner;

public class MouseAndCrocs {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
            for (int i = arr.length-1; i >=0 ; i--) {
                for(int j=0;j<arr[i].length;j++){
                    if(j==n-1 && i==0){
                        break;
                    } else{
                        if(i==0){
                        System.out.print("R");
                    } else if (j==n-1) {
                            System.out.print("F");
                        } else if(arr[i-1][j]>arr[i][j+1]){
                        System.out.print("F");
                    }else {
                        System.out.print("R");
                    }
                    }
                }
            }
    }
}
