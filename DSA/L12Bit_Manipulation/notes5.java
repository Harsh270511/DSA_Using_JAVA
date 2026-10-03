//this program is for clear ith bit mtlb ith bit vale binaray number ko 0 bna dena h
package ApnaCollege.L12Bit_Manipulation;

public class notes5 {
  public static int clearIthBit(int num, int i) {
    int bitmask = ~(1 << i);
    return num & bitmask;
  }

  public static void main(String[] args) {
    System.out.println("the result after clearing the ith bit would be: " + clearIthBit(10, 1));
  }

}
