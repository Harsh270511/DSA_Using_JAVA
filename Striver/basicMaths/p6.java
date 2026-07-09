//Print all Divisor Brute force
package Striver.basicMaths;

public class p6 {
  public static void divisor(int n){

    for(int i=1;i <= n; i++){
      if(n %i==0){
        System.out.print( i+" ");
      }
    }
  }
 public static void main(String[] args) {
  int x=36;
  divisor(x);
 } 
}
