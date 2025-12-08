package L9Basic_Sorting_Algorithm;

public class notes3 {
  // Selection sort algorithm
  public static void SelectionSort1(int[] arr) {
    for (int turn = 0; turn < arr.length - 1; turn++) {
      int minPosition = turn;

      for (int i = turn + 1; i < arr.length; i++) {
        if (arr[minPosition] <  arr[i]) {
          minPosition = i;
        }
      }
      // Correct swapping
      int temp = arr[minPosition];
      arr[minPosition] = arr[turn];
      arr[turn] = temp;
    }
  }

  public static void printArr(int[] num) {
    for (int j = 0; j < num.length; j++) {
      System.out.print(num[j] + " ");
    }
  }

  public static void main(String[] args) {
    int[] arr = { 5, 4, 1, 3, 2, 6, 4, 2 };
    SelectionSort1(arr);
    printArr(arr);
  }
}
