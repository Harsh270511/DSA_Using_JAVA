//reverse the given ArrayList
package ApnaCollege.L19ArrayList;

import java.util.ArrayList;

public class notes3 {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(11);
    list.add(111);
    list.add(1111);
    list.add(11111);
    list.add(111111);

    // reverse the given arraylist
    for (int i = list.size() - 1; i >= 0; i--) {
      System.out.println(list.get(i));
    }

  }
}
