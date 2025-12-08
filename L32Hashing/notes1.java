//Hashing Operators
package L32Hashing;

//Importing to use the HashMap
//import java.util.HashMap;
import java.util.*;

public class notes1 {
  public static void main(String[] args) {
    // Sytex of Hashing
    HashMap<String, Integer> hm = new HashMap<>();

    // Add/Insert: T.C=O(1)
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    // System.out.println(hm);

    // Get: T.C= O(1)
    int population = hm.get("India");
    // System.out.println("Population of India is: "+population);

    // containsKey: T.C= O(1)
    boolean val = hm.containsKey("India");
    // System.out.println(val);//true
    boolean val1 = hm.containsKey("Japan");
    // System.out.println(val1);//false

    // remove: T.C=O(1)
    // System.out.println(hm.remove("China"));
    // System.out.println(hm.remove("Pakistan"));
    // System.out.println(hm);

    //size
    System.out.println(hm.size());

    //isEmpty()
    System.out.println(hm.isEmpty());//false

    //clear
    // hm.clear();//hashmap ko clear kr diya ab isEmpty krte hei true return hoga
    // System.out.println(hm.isEmpty());//true

    Set<String> keys= hm.keySet();
    System.out.println(keys);
  }
}
