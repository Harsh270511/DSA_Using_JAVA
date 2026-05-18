//program to count the number of set bits
package ApnaCollege.L12Bit_Manipulation;

public class notes11 {
  public static int countSetBits(int num){
    int count =0;
    while(num >0){
      if((num & 1) !=0){
        count++;
      }
      num = num >>1;
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.println(countSetBits(10));
  }
}
