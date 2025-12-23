//Union and Intersection of two array
package L32Hashing;

import java.util.*;

public class notes12 {
  public static void main(String[] args) {
    int[] arr1 = { 7, 3, 9 };
    int[] arr2 = { 6, 3, 9, 2, 9, 4 };
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }
    for (int j = 0; j < arr2.length; j++) {
      set.add(arr2[j]);
    }
    System.out.println("union of 2 array is: " + set.size());

    // intersection
    set.clear();

    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }
    int count = 0;
    for (int j = 0; j < arr2.length; j++) {
      if (set.contains(arr2[j])) {
        count++;
        set.remove(arr2[j]);
      }

    }
    System.out.println("intersection: " + count);
  }
}
