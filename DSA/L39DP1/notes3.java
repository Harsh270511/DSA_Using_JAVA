//climbing stairs using memoization
package ApnaCollege.L39DP1;

import java.util.Arrays;

public class notes3 {
  public static int climbStairs(int n){
    int[] ways= new int[n+1];
    Arrays.fill(ways, -1);// initally array is filled with -1 instead of 0

    if(n==0){
      return 1;
    }
    if(n <0){
      return 0;
    }
    if(ways[n] != -1){
      return ways[n];
    }
    ways[n]= climbStairs(n-1)+climbStairs(n-2);
    return ways[n];
  }
  public static void main(String[] args) {
    int n=44;
    System.out.println(climbStairs(n));
  }
}
