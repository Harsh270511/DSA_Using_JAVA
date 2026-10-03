//Sliding window maximum
package ApnaCollege.L31Heaps;

import java.util.*;

public class notes11 {
  static class Pair implements Comparable<Pair> {
    int val;
    int idx;
//constructor
    public Pair(int val, int idx) {
      this.val = val;
      this.idx = idx;

    }

    @Override
    public int compareTo(Pair p1) {

      // return this.val- p1.val; ascending order

      // descending order
      return p1.val - this.val;
    }
  }

  public static void main(String[] args) {
    int[] window = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int k = 3;
    //Array where we store value after each k sliding window
    int[] res = new int[window.length - k + 1];// n-k+1

    PriorityQueue<Pair> pq = new PriorityQueue<>();
    for (int i = 0; i < k; i++) {
      pq.add(new Pair(window[i], i));
    }
    res[0] = pq.peek().val;// top vali value k
    for (int i = k; i < window.length; i++) {
      while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
        pq.remove();
      }
      pq.add(new Pair(window[i], i));
      res[i - k + 1] = pq.peek().val;
    }
    // print result which is stored in res(its an array of size i-k+1)
    for (int i = 0; i < res.length; i++) {
      System.out.print(res[i] + " ");
    }
    System.out.println();

  }
}
