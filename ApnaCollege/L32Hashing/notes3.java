//Hashing: Use of entrySet()
package ApnaCollege.L32Hashing;
import java.util.*;

public class notes3 {
  public static void main(String[] args) {
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 1001);
    hm.put("China", 1002);
    hm.put("America", 1003);
    hm.put("Indonesia", 1004);
    hm.put("Afganistan", 1005);
    hm.put("Japan", 1006);
    hm.put("Bhutan", 1007);

    // Iteration with the help of entrySet()
    for(Map.Entry<String, Integer> ES: hm.entrySet()){
      System.out.println(ES.getKey() + " --> "+ ES.getValue());
    }

  }
}

