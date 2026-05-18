//power(x , n) at T.C= O(logn)
package ApnaCollege.L14_15Recursion;

public class notes10 {
  public static int optimisedPower(int x, int n){
    if(n==0){
      return 1;
    }
    // int halfPowerSquare = optimisedPower(x, n/2) * optimisedPower(x, n/2); because of this the T.C will still be O(n) because of twice recursive calling 

    int halfPower = optimisedPower(x, n/2);
    int halfPowerSquare = halfPower * halfPower;
    //condition for odd power
    if(n % 2 != 0){
      halfPowerSquare = x * halfPowerSquare;
    }
    return halfPowerSquare;
  }
  public static void main(String[] args) {
    int x =2;
    int n=5;
    System.out.println(optimisedPower(x, n));
  }
}
