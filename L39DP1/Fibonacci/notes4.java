//fib space optimization
package L39DP1.Fibonacci;

public class notes4 {
  public static int fibSpace(int n) {
    if (n <= 0) {
      return 0;

    }
    int prev1 = 1;
    int prev2 = 0;
    int curr = 0;

    for (int i = 2; i <= n; i++) {
      curr = prev1 + prev2;

      prev2 = prev1;

      prev1 = curr;
    }
    return prev1;
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println(fibSpace(n));

  }
}
