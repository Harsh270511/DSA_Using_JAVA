//printing the number in decreasing order using recursion
package L14_15Recursion;

public class notes1 {

  public static void printDec(int n){
    if(n==1){
      System.out.print(n);
      return;
    }
    System.out.print(n + " ");
    printDec(n -1);
  }
  public static void main(String[] args) {
    int n=10;
    printDec(n);
  }
  
}
