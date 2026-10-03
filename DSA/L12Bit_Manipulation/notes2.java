//odd and even using the bit and operator
package ApnaCollege.L12Bit_Manipulation;

public class notes2 {
  public static void oddEven(int num) {
    int bit = 1;
    if ((num & bit) == 0) {
      System.out.println("Even number");
    } else {
      System.out.println("Odd number");
    }
  }

  public static void main(String[] args) {
    oddEven(12);//call the oddEven function multiple times with different arguments
    oddEven(7);
    oddEven(45);
  }

}
