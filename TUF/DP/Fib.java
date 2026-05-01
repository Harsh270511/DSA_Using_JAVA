package TUF.DP;
import java.util.Arrays;

public class Fib {
  static int[] dp;
  //Memoization
  public static int fib(int n){
    //base case
    if(n==0 || n==1){
      return n;
    }
    if(dp[n] != -1){
      return dp[n];
    }
    return dp[n]= fib(n-1)+ fib(n-2);

  }
  public static void main(String[] args) {
    int n=7;
    dp= new int[n+1];
    Arrays.fill(dp, -1);
    System.out.println(fib(n));
  }
}
