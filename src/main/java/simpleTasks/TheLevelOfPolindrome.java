package simpleTasks;

import java.util.Scanner;

public class TheLevelOfPolindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String m=sc.next();
        int count=0;
        for (int i = 0; i < m.length()/2+m.length()%2; i++) {
            if(m.charAt(i)==m.charAt(m.length()-1-i)){
                count++;
            }
        }
        System.out.println(count);

    }
}
