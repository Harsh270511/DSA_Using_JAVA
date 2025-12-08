package Extra;

public class aa1 {
  public static void printPair(int nums[]) {
    int total = 0;
    for (int i = 0; i < nums.length; i++) {
      int curr = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        System.out.print(curr + "," + nums[j] + "   ");
        total++;
      }
    }
    System.out.println();
    System.out.println("The totoal number of pairs are: " + total);
  }

  public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 5, 6 };
    printPair(arr);
  }
}
