//basics of Heap (add, remove, peek)
package ApnaCollege.L31Heaps;
import java.util.*;
public class notes1 {
  public static void main(String[] args) {

    //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());this will helps to reverse the order
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    //Add---> O(logn)
    pq.add(11);
    pq.add(2);
    pq.add(64);
    pq.add(9);
    pq.add(1999);

    while(!pq.isEmpty()){
      System.out.print(pq.peek()+" ");//Peek---> O(1)
      pq.remove();//Remove---> O(logn)
    }
  }
}
