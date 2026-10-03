//pow(x ,n) at T.C =O(n)
package ApnaCollege.L14_15Recursion;

public class notes9 {
  public static int power(int x, int n){
    if(n ==0){
      return 1;
    }
    int pxm1 = power(x, n-1);
    int pn = x * pxm1;
    return pn;
  }
  public static void main(String[] args) {
    System.out.println(power(2, 10));
  }
}
