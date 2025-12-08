//Sorting using Collections
package L19ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class notes6 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(11);
    list.add(2);
    list.add(13);
    list.add(4);
    list.add(9);

    System.out.println("List before sorting: " + list);
    Collections.sort(list);
    System.out.println("List after sorting in ascending order: " + list);

    Collections.sort(list, Collections.reverseOrder());
    System.out.println("List after sorting in descending order: " + list);
    //Comparator-fxn logic

  }
}
