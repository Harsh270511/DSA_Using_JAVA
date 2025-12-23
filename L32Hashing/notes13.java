//Find Itinerary from tickets
package L32Hashing;

import java.util.*;

public class notes13 {
  public static String getStart(HashMap<String, String> tickets) {
    HashMap<String, String> revMap = new HashMap<>();
    for (String key : tickets.keySet()) {
      revMap.put(tickets.get(key), key);
    }
    for (String key : tickets.keySet()) {
      if (!revMap.containsKey(key)) {
        return key;// Starting pointing dega
      }
    }
    return null;
  }

  public static void main(String[] args) {
    HashMap<String, String> ticket = new HashMap<>();
    ticket.put("Chennai", "Benagluru");
    ticket.put("Mumbai", "Delhi");
    ticket.put("Goa", "Chennai");
    ticket.put("Delhi", "Goa");

    String start = getStart(ticket);
    System.out.print(start);
    for (String kkk : ticket.keySet()) {
      System.out.print("--> " + ticket.get(start));
      start = ticket.get(start);
    }
    System.out.println();
  }
}
