//implementation of the HashSet using iterator and advance for loop
package ApnaCollege.L21LinkedList2.L32Hashing;

import java.util.*;

public class notes9 {
  public static void main(String[] args) {
    HashSet<String> cities = new HashSet<>();
    cities.add("Prayagraj");
    cities.add("Noida");
    cities.add("Greater Noida");
    cities.add("Jharkhand");
    cities.add("big bajar");

    // this is the method of iterator
    Iterator it= cities.iterator();
    while(it.hasNext()){
    System.out.println(it.next());
    }

    // this is the advance method to iterator the HashSet using ForEach loop
    for (String city : cities) {
      System.out.println(city);
    }
  }
}
