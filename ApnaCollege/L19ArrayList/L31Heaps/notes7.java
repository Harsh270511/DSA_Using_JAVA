
//Heap sort Descending order T.C= O(nlogn) with changing the sign in heapify fxn and calculate the minIdx this time... 
package ApnaCollege.L19ArrayList.L31Heaps;

public class notes7 {
  // heapify function
  public static void heapify(int[] arr, int i, int size) {
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int minIdx = i;

    //just changing the sign here (arr[minIdx] > arr[left] and arr[minIdx] > arr[right])
    if (left < size && arr[minIdx] > arr[left]) {
      minIdx = left;

    }
    if (right < size && arr[minIdx] > arr[right]) {
      minIdx = right;
    }
    if (minIdx != i) {
      // swap
      int temp = arr[i];
      arr[i] = arr[minIdx];
      arr[minIdx] = temp;

      heapify(arr, minIdx, size);
    }
  }

  public static void heapSort(int[] arr) {
    // step 1-> to build the maxHeap
    int n = arr.length;
    for (int i = n / 2; i >= 0; i--) {//O(nlogn)
      heapify(arr, i, n);
    }

    // step 2-> largest push at the end
    for (int i = n - 1; i >= 0; i--) {//O(nlogn)
      // swap(first larget to end)
      int temp = arr[0];
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(arr, 0, i);

      //Total T.C= O(nlogn + nlogn)==O(nlogn)
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 5, 3 };
    heapSort(arr);

    // print
    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");

    }
    System.out.println();
  }
}
