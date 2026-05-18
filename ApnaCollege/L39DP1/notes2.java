//climbing stairs using recursion
package ApnaCollege.L39DP1;

public class notes2 {
  public static int climbRecursion(int n){
    //base case
    if(n==0){
      return 1;
    }
    if(n<0){
      return 0;
    }
    return climbRecursion(n-1)+ climbRecursion(n-2);
  }
  public static void main(String[] args) {
    int n=5;
    System.out.println(climbRecursion(n));
  }
}
