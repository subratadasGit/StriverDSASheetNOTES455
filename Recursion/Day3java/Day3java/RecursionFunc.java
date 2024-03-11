package Day3java;

// Sum of N numbers with Functional Way

public class RecursionFunc {
     static int func(int i){
        if (i==0) {
            return 0 ;            
        }
        return i + func(i-1);
    }
    public static void main(String[] args) {
       int result = func(5);
    System.out.println(result);
    }
    
}
