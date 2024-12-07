package simpleTasks;

import java.util.Scanner;

public class Function5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long f=(long)(x*y*z+x+y*y+z*z*z);
        System.out.println(f);
    }
}
