
//Print numbers 1 to N

package Day2Java;

import java.util.Scanner;

public class Day2java02 {

    static void f(int count , int n ){
        if(count==n){
            return ;
        }
        else{
      System.out.println(count);
      f(count+1, n);
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
