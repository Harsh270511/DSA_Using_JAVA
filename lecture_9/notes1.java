

public class notes1 {
  public static void BubbleSort(int[] arr) {
    // outer loop
    for (int turn = 0; turn < arr.length - 1; turn++) {
      // inner loop
      boolean swapped = false;
      for (int i = 0; i < arr.length - 1 - turn; i++) {
        if (arr[i] > arr[i + 1]) {
          // swap phle vala number agr bada h to ushke next index vale elements se swap kr
          // do
          arr[i] = arr[i] ^ arr[i + 1];
          arr[i + 1] = arr[i] ^ arr[i + 1];
          arr[i] = arr[i] ^ arr[i + 1];
          swapped = true;// swapped is executes
        }
      }
      if(!swapped){
        break;
      }

    }
  }

  public static void printArr(int nums[]) {
    for (int j = 0; j < nums.length; j++) {
      System.out.print(nums[j] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = {5,4,1,3,2};
    BubbleSort(arr);
    printArr(arr);
  }
}
