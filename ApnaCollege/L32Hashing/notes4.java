//implementation of the LinkedHashMap--> Keys are in insertation order
package ApnaCollege.L32Hashing;
import java.util.LinkedHashMap;
public class notes4 {

  public static void main(String[] args) {
    LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
    lhm.put("India", 140);
    lhm.put("China", 120);
    lhm.put("Russia", 50);
    lhm.put("Japan", 80);
    System.out.println(lhm);
  }
}
