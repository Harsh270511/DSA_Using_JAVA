//fibonacci using recursion
package L39DP1.Fibonacci;
public class notes1 {
    public static int fibRecursion(int n){
        if(n <=1){
            return n;
        }
        return fibRecursion(n-1)+ fibRecursion(n-2);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibRecursion(n));
    }
    
} 