//kadane's Algorithm
package L8Array_Part2;
public class notes2 {
  public static void kadaneAlgo(int nums[]){
    int ms = Integer.MIN_VALUE;
    int cs= 0;
    for(int i=0;i < nums.length ;i++){
      cs += nums[i];
      if(cs > ms){
        ms = cs;
      }
      if(cs < 0){
        cs =0;
      }
    }
    System.out.println("The maximum sum will be: "+ ms);
  }
  public static void main(String[] args){
    int nums[]= {-1, 4, 6, -3, 8};
    kadaneAlgo(nums);
  }
}
