//Deque Implementation
package L24Queues;

import java.util.*;

public class notes10 {
  public static void main(String[] args) {
    Deque<Integer> d = new LinkedList<>();
    d.addFirst(1);// 1
    d.addFirst(2);// 2 1
    d.addLast(4);// 2 1 4
    d.addLast(3);// 2 1 4 3
    d.removeLast();// 2 1 4
    d.removeFirst();// 1 4
    System.out.println(d);
    System.out.println("First element: "+ d.getFirst());
    System.out.println("Last element: "+ d.getLast());
  }
}
