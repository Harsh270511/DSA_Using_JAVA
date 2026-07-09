// GCD brute force
package Striver.basicMaths;

public class p9 {
  public static void gcd(int n1, int n2){

    for(int i= Math.min(n1, n2); i>=1; i--){
      if(n1 %i==0 && n2 %i==0){
        System.out.println(i);
        break;
      }
    }
  }
  public static void main(String[] args) {
    gcd(11, 40);
  }
}
