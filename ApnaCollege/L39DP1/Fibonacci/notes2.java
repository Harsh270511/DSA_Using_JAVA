//fib using memoization
package ApnaCollege.L39DP1.Fibonacci;

import java.util.*;

public class notes2 {
  public static int fibMemoization(int n, int[] dp) {
    if (n <= 1) {
      return n;
    }
    if (dp[n] != -1) {
      return dp[n];
    }
    dp[n] = fibMemoization(n - 1, dp) + fibMemoization(n - 2, dp);
    return dp[n];
  }

  public static void main(String[] args) {
    int n = 1;
    int[] dp = new int[n + 1];
    Arrays.fill(dp, -1);
    System.out.println(fibMemoization(n, dp));
  }
}
