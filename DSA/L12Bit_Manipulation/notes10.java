//power of two finding program
package ApnaCollege.L12Bit_Manipulation;

public class notes10 {
  public static boolean checkPowerOfTwo(int num){
    return (num & (num -1 ))==0;
  }
  public static void main(String[] args) {
    System.out.println(checkPowerOfTwo(32));
    System.out.println(checkPowerOfTwo(17));
  }
  
}
