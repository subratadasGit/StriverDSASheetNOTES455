
//Print numbers 1 to N using Bacltrackingh


package Day2Java;

import java.util.Scanner;

public class Day2java04 {

    static void f(int n, int num ){
        if(n<num){
            return ;
        }
        else{
      f(n-1, num);
      System.out.println(n);
    }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Range to print the Numbers");
        int n = sc.nextInt();

        f(n,1);
        sc.close();
    }
    
}
