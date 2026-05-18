//swap 2 variables in ArrayList
package ApnaCollege.L19ArrayList;

import java.util.ArrayList;

public class notes5 {
  public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(11);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    int idx1 = 1, idx2 = 3;
    System.out.println("List before swap: " + list);
    swap(list, idx1, idx2);
    System.out.println("List after swap: " + list);

  }
}
