//Trapped water calculation
package ApnaCollege.L8Array_Part2;

public class notes3 {
  public static int TrapWater(int height[]) {
    int n = height.length;
    // left max Boundary -> array

    int leftMax[] = new int[n];
    leftMax[0] = height[0];

    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i - 1]);
    }

    // right max boundary -> array
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];

    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i + 1]);
    }
    // loop
    int TrapWater = 0;
    for (int i = 0; i < n; i++) {

      // waterLevel = min(left Max bound, right Max bound)
      int waterLevel = Math.min(leftMax[i], rightMax[i]);

      // trapped water = waterLevel - height[i]

      TrapWater += waterLevel - height[i];

    }
    return TrapWater;

  }

  public static void main(String[] args) {
    int height[] = { 4, 2, 0, 6, 3, 2, 5 };
    System.out.println(TrapWater(height));
  }

}
