//program for non-consecutive zeroes
package ApnaCollege.L14_15Recursion;

public class notes15 {
  public static void printBString(int n, int lastPlace, String str){
    if(n ==0){
      System.out.println(str);
      return;
    }
    printBString(n-1, 1, str+"1");
    if(lastPlace==1){
      printBString(n-1, 0, str+"0");
    }
  }
  public static void main(String[] args) {
    printBString(5, 1, "");
  }
  
}
