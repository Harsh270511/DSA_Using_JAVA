//Implementation of HashSet 
package L32Hashing;

import java.util.*;

public class notes8 {
  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();
    hs.add(2);
    hs.add(5);
    hs.add(6);
    hs.add(2);

    System.out.println(hs);
    System.out.println(hs.size());
    // return nothing in this case
    if (hs.contains(4)) {
      System.out.println("Yes 4 is Contains");//
    }
    if (hs.contains(5)) {
      System.out.println("Yes 5 is Contains 5");
    }
    hs.remove(2);
    if (hs.contains(2)) {
      System.out.println("Yes 2 is contains");
    }
    System.out.println(hs);

    System.out.println(hs.isEmpty());
    hs.clear();
    System.out.println(hs.isEmpty());
    
  }
}
