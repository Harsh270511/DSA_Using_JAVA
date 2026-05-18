//majority elements
package ApnaCollege.L21LinkedList2.L32Hashing;

import java.util.*;

public class notes6 {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1, 5, 5 };

    HashMap<Integer, Integer> hm = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {

//{{{ if (hm.containsKey(arr[i])) {
      //   hm.put(arr[i], hm.get(arr[i]) + 1);
      // } else {
      //   hm.put(arr[i], 1);
      // }
//The above if and else condition is converted into 1 single line as given below }}}
      hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
    }
    
    Set<Integer> keySet = hm.keySet();
    for (Integer key : keySet) {
      if (hm.get(key) > arr.length / 3) {
        System.out.print(key + ", ");
      }
    }

  }
}
