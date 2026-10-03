//finding the first occurences
package ApnaCollege.L14_15Recursion;

public class notes7 {
  public static int firstOcc(int[] arr, int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    if (arr[i] == key) {
      return i;
    }
    return firstOcc(arr, key, i+1);

  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5, 7, 342, 234, 1, 34545, 645 };
    int key = 4;
    System.out.println(firstOcc(arr, key, 0));
  }

}
