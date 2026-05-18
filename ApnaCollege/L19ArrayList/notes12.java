//this is the better to solve the sum pair 1 using 2 pointer approach

package ApnaCollege.L19ArrayList;

import java.util.ArrayList;

public class notes12 {
  public static boolean pairSum(ArrayList<Integer> height, int target) {
    int lp = 0;
    int rp = height.size() - 1;
    while (lp != rp) {
      if (height.get(lp) + height.get(rp) == target) {
        return true;
      }
      if (height.get(lp) + height.get(rp) < target) {
        lp++;
      } else {
        rp--;
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
    int target = 10;

    System.out.println(pairSum(height, target));
  }
}
