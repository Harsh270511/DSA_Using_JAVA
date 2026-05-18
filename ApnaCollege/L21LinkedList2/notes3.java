//java collection framework--> LinkedList
package ApnaCollege.L21LinkedList2;

import java.util.LinkedList;

public class notes3 {
  public static void main(String[] args) {
    // create
    LinkedList<Integer> ll = new LinkedList<>();

    // add kayse krna hai
    ll.addLast(1);
    ll.addLast(2);
    ll.addFirst(0);
    //System.out.println(ll.reversed());
    System.out.println("LL when added: " + ll);

    // remove kayse krna hai
    ll.removeLast();
    ll.removeFirst();
    ll.reversed();
    System.out.println("LL when removed: " + ll);
  }
}
