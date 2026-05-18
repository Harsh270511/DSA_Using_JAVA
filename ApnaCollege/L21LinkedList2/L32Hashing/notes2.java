//Hashing:Use of  keySet() for Iteration
package ApnaCollege.L21LinkedList2.L32Hashing;

import java.util.*;

public class notes2 {
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 1001);
    hm.put("China", 1002);
    hm.put("America", 1003);
    hm.put("Indonesia", 1004);
    hm.put("Afganistan", 1005);
    hm.put("Japan", 1006);
    hm.put("Bhutan", 1007);

    // Iteration with the help of keySet()
    Set<String> keys = hm.keySet();
    System.out.println(keys);
    for (String s : keys) {
      System.out.println("(Key: " + s + " ,value: " + hm.get(s) + " )");
    }

  }
}
