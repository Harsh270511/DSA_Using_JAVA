//clear from ith bit to jth bits
package ApnaCollege.L12Bit_Manipulation;

public class notes9 {
  public static int clearIthToJthBits(int num, int i, int j) {
    int a = (~0) << (j + 1);
    int b = (1 << i) - 1;
    int bitmask = a | b;
    return num & bitmask;

  }

  public static void main(String[] args) {
    System.out.println(clearIthToJthBits(150, 2, 7));
  }
}
