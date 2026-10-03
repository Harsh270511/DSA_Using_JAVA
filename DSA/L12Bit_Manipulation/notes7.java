//this is the 2nd way to update the ith bit
package ApnaCollege.L12Bit_Manipulation;

public class notes7 {
  // this is the clearIthBit vala function
  public static int clearIthBit(int num, int i) {
    int bitmask = ~(1 << i);
    return num & bitmask;
  }

  //setIthBit is not in used for 2nd approach
  // this is the setIthBit vala function
  // public static int setIthBit(int num, int i) {
  //   int bitmask = 1 << i;
  //   return num | bitmask;
  // }

  // this is the updateIthBit vala function
  public static int updateIthBit(int num, int i, int newBit) {
    num = clearIthBit(num, i);
    int Bitmask = newBit << i;
    return num | Bitmask;

  }

  public static void main(String[] args) {
    System.out.println("The updated ith value would be : " + updateIthBit(15, 2, 0));
  }

}
