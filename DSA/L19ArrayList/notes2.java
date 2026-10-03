package ApnaCollege.L19ArrayList;

import java.util.ArrayList;

public class notes2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(11);
    list.add(111);
    list.add(1111);
    list.add(11111);
    list.add(111111);

    System.out.println(list.size());

    // print the each value of arraylist
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" ");
    }
  }

}
