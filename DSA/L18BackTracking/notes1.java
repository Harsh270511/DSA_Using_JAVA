//BackTracking in an array
package ApnaCollege.L18BackTracking;

public class notes1 {
  public static void changeArr(int[] arr, int i, int val) {
    // base case
    if (i == arr.length) {
      printArr(arr);
      return;
    }
    // recursion(kaam )
    arr[i] = val;
    changeArr(arr, i + 1, val + 1);
    arr[i] = arr[i] - 2;
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[] arr = new int[10];// the array with element is filled by recursion
    changeArr(arr, 0, 1);
    printArr(arr);
  }
}
