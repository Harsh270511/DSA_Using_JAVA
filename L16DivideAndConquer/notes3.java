package L16DivideAndConquer;

public class notes3 {
  public static int searching(int arr[], int tar, int si, int ei) {
    // base case
    if (si > ei) {
      return -1;
    }
    // kaam
    // mid calculation
    int mid = (si + ei) / 2;

    // Mid match with target
    if (arr[mid] == tar) {
      return mid;
    }

    // mid on L1
    if (arr[si] <= arr[mid]) {
      // case A:
      if (arr[si] <= tar && tar <= arr[mid]) {
        return searching(arr, tar, si, mid - 1);
      } else {
        // case B:
        return searching(arr, tar, mid + 1, ei);
      }
    }

    // mid on L2
    else {
      // case C:
      if (arr[mid] <= tar && tar <= arr[ei]) {
        return searching(arr, tar, mid + 1, ei);
      }

      else {
        // case D:
        return searching(arr, tar, si, mid - 1);
      }
    }

  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    int target = 0;
    int tarIndex = searching(arr, target, 0, arr.length - 1);
    System.out.println("The targeted element is found at index: " + tarIndex);
  }
}
