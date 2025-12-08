//this is the brute force to solve the sum pair 1
package L19ArrayList;

import java.util.ArrayList;

public class notes11 {
  public static boolean pairSum(ArrayList<Integer> height, int target) {
    for (int i = 0; i < height.size(); i++) {
      for (int j = 0; j < height.size(); j++) {
        if (height.get(i) + height.get(j) == target) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(2);
    height.add(3);
    height.add(4);
    height.add(5);
    int target = 101;

    System.out.println(pairSum(height, target));
  }
}
