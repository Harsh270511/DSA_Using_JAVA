//NearBy cars problem same question exist on leetcode problem no. 973 with diff. name
package ApnaCollege.L19ArrayList.L31Heaps;

import java.util.*;

public class notes8 {
  static class Points implements Comparable<Points> {
    int x, y, idx, distSq;

    // constructor
    public Points(int x, int y, int idx, int distSq) {
      this.x = x;
      this.y = y;
      this.idx = idx;
      this.distSq = distSq;
    }

    @Override
    public int compareTo(Points p2) {
      return this.distSq - p2.distSq;// ascending order
    }
  }

  public static void main(String[] args) {
    int[][] points = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
    int k = 2;

    PriorityQueue<Points> pq = new PriorityQueue<>();
    for (int i = 0; i < points.length; i++) {
      int distSq = points[i][0] * points[i][0] + points[i][1] * points[i][1];// (x*x + y*y)
      pq.add(new Points(points[i][0], points[i][1], i, distSq));
    }
    // nearest k cars
    for (int i = 0; i < k; i++) {
      System.out.print(Arrays.toString(new int[] { pq.peek().x, pq.peek().y }));
      pq.remove();
    }

  }
}
