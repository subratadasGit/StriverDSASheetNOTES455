// package Day2Java;

// // print name 5 times 
// public class Day2JavaCode {
// static int count =0;
//     static void f(){
//         if(count==5){
//             return ;
//         }
//         else{
//             System.out.println("Subrata Das");
//             count++;
//             f();
//         }
//     }

//     public static void main(String[] args) {
//         f();
//     }
    
// }

package Day2Java;

// print name 5 times 
public class Day2JavaCode {

    static void f(int count , int n ){
        if(count>n){
            return ;
        }
        else{
      System.out.println("Subrata Das");
      f(count+1, n);
    }
    }
    public static void main(String[] args) {
        f(0,4);
    }
    
}
