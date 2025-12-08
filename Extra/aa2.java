package Extra;

public class aa2 {
  public static void subArray(int[] nums) {
    int n = nums.length;
    int maxSum = Integer.MIN_VALUE;
    int minSum = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {

      for (int j = i; j < n; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
          sum += nums[k];
        }
        if (sum > maxSum) {
          maxSum = sum;
        }
        if (sum < minSum) {
          minSum = sum;
        }
        System.out.println("(" + i + "," + j + ")" + " sum is: " + sum);
      }
    }
    System.out.println("Max  sum is : " + maxSum);
    System.out.println("Min sum is: " + minSum);

  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5, 6 };
    subArray(arr);
  }
}
