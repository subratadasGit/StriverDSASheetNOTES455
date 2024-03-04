
//Print numbers N to 1 using BackTracking

package Day2Java;

import java.util.Scanner;

public class Day2java05 {

    static void f(int count , int n ){
        if(count>n){
            return ;
        }
        else{
      
      f(count+1, n);
      System.out.println(count);
    }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Range to print the Numbers");
        int n = sc.nextInt();

        f(1,n);
        sc.close();
    }
    
}