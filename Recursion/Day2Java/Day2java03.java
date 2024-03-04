
//Print numbers 1 to N

package Day2Java;

import java.util.Scanner;

public class Day2java03 {

    static void f(int n, int num ){
        if(n<num){
            return ;
        }
        else{
      System.out.println(n);
      f(n-1, num);
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