//Question 1 implementation through Java collection framework
package ApnaCollege.L24Queues;
import java.util.*;
public class notes4 {
  public static void main(String[] args) {
    Queue<Integer> q= new LinkedList<>();//or ArrayDeque
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
