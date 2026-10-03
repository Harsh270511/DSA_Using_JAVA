package ApnaCollege.L12Bit_Manipulation;

public class notes8 {
  public static int clearIthBit(int num, int i){
    //int bitmask = (~0)<< i;
            //OR
    int bitmask = -1 <<i;
    return num & bitmask;
  }
  public static void main(String[] args) {
    System.out.println( "Result after clearing the ith bit : " +clearIthBit(15, 2));
  }
  
}
