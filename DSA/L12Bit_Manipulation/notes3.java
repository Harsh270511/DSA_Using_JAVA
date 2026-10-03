// this is the program for getting the ith bit either it would be 0 or 1
package ApnaCollege.L12Bit_Manipulation;

public class notes3 {
  public static void main(String[] args) {
    System.out.println("The bit at ith index will be : " + getIthBit(15, 4));
    // output 1 ishliye aya kuki 15 to binary form me ayse represent krte hain
    // (00001111) to agr hum ith position pr deykhe to i =1 aa rha h
  }

  public static int getIthBit(int num, int i) {
    int bitmask = 1 << i;
    if ((num & bitmask) == 0) {
      return 0;
    } else {
      return 1;
    }
  }

}
