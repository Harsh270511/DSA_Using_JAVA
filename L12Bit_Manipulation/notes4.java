//this is the program to set the bit as 1
package L12Bit_Manipulation;

public class notes4 {
  public static int setIthBit(int number, int i){
    //key concept
    int bitmask = 1<< i;
    return number | bitmask;
  }
  public static void main(String[] args) {
    System.out.println(setIthBit(10, 2));
  }
  
}
