//connect n ropes
package ApnaCollege.L31Heaps;
import java.util.*;

public class notes9 {
  public static void main(String[] args) {
    int[] ropes= {2,3,8, 3, 4, 6};
    
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0; i < ropes.length; i++){
      pq.add(ropes[i]);
    }
    int cost =0;
    while(pq.size() >1){
      int min1 = pq.remove();//it give the first element in PQ and it will be the minimum onces
      int min2= pq.remove();//it give the second element as after min1  it becomes minimum onces
      cost += min1 + min2;
      pq.add(min1 + min2);
    }
    System.out.println("Min cost in connecting the ropes is:"+ cost);
  }
}
