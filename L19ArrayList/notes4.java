//find the maximun element in the ArrayList
package L19ArrayList;

import java.util.ArrayList;

public class notes4 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(11);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    // max element
    int larget = Integer.MIN_VALUE;
    for (int i = 0; i < list.size(); i++) {
      larget = Math.max(larget, list.get(i));
    }
    System.out.println("The maximum is: " + larget);

  }
}
