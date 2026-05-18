package ApnaCollege.Extra;

import java.util.*;

public class notes1 {
  public static int largest(int[] arr){
    int max=arr[0];
    

    for(int i=1; i< arr.length; i++){
      if(arr[i] > max){
        max= arr[i];
      }
    }
    return max;
  }
  public static void main(String[] args) {
    int[] arr = { 5, 4, 0, 3, 1 };

    // Arrays.sort(arr);
    // System.out.println(arr[arr.length - 2]);
    System.out.println(largest(arr));
  }
}
