package Day3java;

// Sum of N numbers with parameterized way



public class RecursionPara {
    static int func(int i, int sum) {
        if (i < 1) {
            return sum;
        } else {
            return func(i - 1, sum + i);
        }
    }

    public static void main(String[] args) {
     int result= func(5, 0);

     System.out.println(result);
    }
}