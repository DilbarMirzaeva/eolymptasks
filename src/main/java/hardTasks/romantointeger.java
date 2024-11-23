package hardTasks;

import java.util.Scanner;

public class romantointeger {
    public static void main(String[] args) {
        char[] roman={'I','V','X','L','C','D','M'};
        int[] num={1,5,10,50,100,500,1000};
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int sum=0;
        for (int j=0;j<a.length();j++) {
            for(int i = 0; i < roman.length; i++){
                            if(a.charAt(j)==roman[i]){
                                sum+=num[i];
                            }
            }
        }
        System.out.println(sum);
    }
}
