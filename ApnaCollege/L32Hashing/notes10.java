//implemenation of Linked Hash set and  treeSet
package ApnaCollege.L32Hashing;

import java.util.*;

public class notes10 {
  public static void main(String[] args) {
    // unordered
    HashSet<String> cities = new HashSet<>();
    cities.add("Delhi");
    cities.add("Up");
    cities.add("Bihar");
    cities.add("Chennai");
    System.out.println(cities);

    // order mentained jo phle add hoga same vayse hei print hoga FIFO
    LinkedHashSet<String> lsm = new LinkedHashSet<>();
    lsm.add("Delhi");
    lsm.add("Up");
    lsm.add("Bihar");
    lsm.add("Chennai");
    System.out.println(lsm);

    //TreeSet implementation
    TreeSet<String> ts= new TreeSet<>();
    ts.add("Delhi");
    ts.add("Up");
    ts.add("Bihar");
    ts.add("Chennai");
    System.out.println(ts);
    
  }
}
