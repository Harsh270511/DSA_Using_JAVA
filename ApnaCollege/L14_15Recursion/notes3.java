//factorial calculation 
package ApnaCollege.L14_15Recursion;

public class notes3 {
  public static int factorial(int n) {
    //edge case
    if(n < 0){
      return -1;
    }
    //actual working from here
    if(n ==0){
      return 1;
    }
    int fnm1= factorial(n -1);//fnm1 = factorial of n-1
    int fn= n* fnm1;//fn = factorial of n
    return fn;
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(factorial(n));    
  }
}
