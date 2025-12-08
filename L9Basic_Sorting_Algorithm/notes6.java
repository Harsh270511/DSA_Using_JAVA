package L9Basic_Sorting_Algorithm;

//counting sort algorithm
public class notes6 {
  public static void countingSort(int nums[]){

    //finding the range
    int largest = Integer.MIN_VALUE;
    for(int i=0; i< nums.length; i++){
      largest = Math.max(largest , nums[i]);
    }

    //frequency calculation we iterate on original vala array
    int[] count = new int[largest + 1];
    for(int j =0; j < nums.length; j++){ // we may also write j ki jgh pr i no issue hota
      count[nums[j]]++;
    }

    //sorting algorithm we iterate on frequency vala array jb the frequecny vali value zero nhi ho jati tb tk ye loop chlta rahga
    int update=0;
    for(int k= 0; k < count.length;k++){ // we may also write k ki jgh pr i no issue hota
      while(count[k] > 0){
        nums[update] = k;
        update++;
        count[k]--;
      }
    }

  }
  public static void printArr(int[] nums){
    for(int i=0; i< nums.length; i++){
      System.out.print(nums[i] + " ");
    }
  }
  public static void main(String[] args) {
    int[] nums= {1,6,8,4,9,2};
    countingSort(nums);
    printArr(nums);
  }
}
