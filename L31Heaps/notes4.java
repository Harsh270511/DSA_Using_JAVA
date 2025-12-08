//Insert the element in the heap using ArrayList::T.C=O(logn)
//Get minimum element in the heap
//Delete the minimum element in the heap
//The output is in the ascending order order formate 
package L31Heaps;

import java.util.*;

public class notes4 {

  static class Heap {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data) {
      // add at last index
      arr.add(data);
      int x = arr.size() - 1;// x is child index
      int parent = (x - 1) / 2;// this is the parent index

      while (arr.get(x) > arr.get(parent)) {// O(logn)
        // swapping
        int temp = arr.get(x);
        arr.set(x, arr.get(parent));
        arr.set(parent, temp);
        // updatation
        x = parent;
        parent = (x - 1) / 2;

      }
    }

    public int peek() {
      return arr.get(0);
    }

    // Heapify Function
    private void heapify(int i) {
      int left = 2 * i + 1;
      int right = 2 * i + 2;
      int minIdx = i;

      // this both if conditional statement is to check for the leaf node and minIdx
      // with left node and right node
      if (left < arr.size() && arr.get(minIdx) < arr.get(left)) {
        minIdx = left;
      }
      if (right < arr.size() && arr.get(minIdx) < arr.get(right)) {
        minIdx = right;
      }
      // to set the heap after the removal of the nodes
      if(minIdx != i) {
        // swap with root and minimum value
        int temp = arr.get(i);
        arr.set(i, arr.get(minIdx));
        arr.set(minIdx, temp);

        // agr heapify ke baad koi aur index pr changes aa gye to ushke liye again call
        // heapify
        heapify(minIdx);
      }

    }

    public int remove() {
      int data = arr.get(0);

      // step 1: swap first and last element in the arraylist
      int temp = arr.get(0);
      arr.set(0, arr.get(arr.size() - 1));
      arr.set(arr.size() - 1, temp);

      // step2: delete the last element
      arr.remove(arr.size() - 1);

      // step 3: heapify
      heapify(0);
      return data;
    }

    public boolean isEmpty() {
      return arr.size() == 0;
    }
  }

  public static void main(String[] args) {
    Heap hp = new Heap();
    hp.add(3);
    hp.add(4);
    hp.add(2);
    hp.add(5);

    while (!hp.isEmpty()) {//heap sort bhi naam de sakte hain--> T.C=O(nlogn)
      System.out.println(hp.peek());
      hp.remove();

    }

  }
}

