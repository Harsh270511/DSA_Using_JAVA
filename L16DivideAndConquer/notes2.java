//Quick sort code
package L16DivideAndConquer;

public class notes2 {
  public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void quickSort(int[] arr, int si, int ei) {
    // base case
    if (si >= ei) {
      return;
    }

    int pivoti = partition(arr, si, ei);// last element
    quickSort(arr, si, pivoti - 1);// left part
    quickSort(arr, pivoti + 1, ei);// right part
  }

  public static int partition(int arr[], int si, int ei) {
    int pivot = arr[ei];// last index should be the pivot
    int i = si - 1;// jagh bananne ke liye jo bhi pivot se chote honge

    for (int j = si; j <= ei; j++) {
      if (arr[j] <= pivot) {
        // i ko kro ++
        i++;
        // swap kro
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

      }
    }

    // for the swapping of pivot, at its correct position temp=pivot,ei = i, i= temp ye bhi kr sakte hain pr maine direct kr diya h
    // i++;
    // arr[ei] = arr[i];
    // arr[i] =pivot;
    return i;
  }

  public static void main(String[] args) {
    int[] arr = { 6, 3, 9, 8, 2, 5 };
    quickSort(arr, 0, arr.length - 1);
    printArr(arr);
  }
}