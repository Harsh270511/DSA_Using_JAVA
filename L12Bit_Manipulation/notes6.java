//update ith bit program this is the 1st way to update the ith bit 
package L12Bit_Manipulation;

public class notes6 {
  // this is the clearIthBit vala function
  public static int clearIthBit(int num , int i){
    int bitmask = ~(1 << i);
    return num & bitmask;
  }


  //this is the setIthBit vala function
  public static int setIthBit(int num, int i){
    int bitmask= 1 << i;
    return num | bitmask;
  }

  //this is the updateIthBit vala function
  public static int updateIthBit(int num, int i, int newBit){
    if(newBit ==0){
      return clearIthBit(num, i);
    }
    else{
      return setIthBit(num, i);
    }
  }
  public static void main(String[] args) {
    System.out.println(updateIthBit(10, 2, 1));
  }

  
}
