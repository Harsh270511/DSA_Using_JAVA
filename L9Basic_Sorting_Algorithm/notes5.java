package L9Basic_Sorting_Algorithm;

import java.util.*;
public class notes5 {
  public static void ArraySort(Float nums[]){
    //Arrays.sort(nums, 0, 3);
    Arrays.sort(nums, Collections.reverseOrder());
  }
  public static void printArr(Float[] arr){
    for(int i=0; i< arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String[] args) {
    Float[] arr = {5f,2f,7f,8f,9f,10f};
    ArraySort(arr);
    printArr(arr);
  }
  
}
