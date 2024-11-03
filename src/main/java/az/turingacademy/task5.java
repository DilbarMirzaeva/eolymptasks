package az.turingacademy;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int last=a%10;
            int first=a/100;
            if(last>first){
                System.out.println(last);
            }else if(first>last){
                System.out.println(first);
            }else{
                System.out.println("equals");
            }
        }


    }

