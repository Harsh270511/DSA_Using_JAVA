//here the program is implementing the stack concept with the Linkedlist

package L22Stack1;

import java.util.*;

public class notes2 {
  static class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
      this.data = data;
      this.next = null;
    }

    static class Stack {
      static Node head;

      public static boolean isEmpty() {
        return head == null;
      }

      // push operator
      public static void push(int data) {
        Node newNode = new Node(data);
        // corner case
        if (isEmpty()) {
          head = newNode;
          return;
        }
        newNode.next = head;
        head = newNode;
      }

      // pop operator
      public static int pop() {
        if (isEmpty()) {
          return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
      }

      // peek operator
      public static int peek() {
        if (isEmpty()) {
          return -1;
        }
        int top = head.data;
        return top;// return head.data bhi directly likh sakte hain
      }

    }
  }

  public static void main(String[] args) {
    Stack st = new Stack();
    st.push(1);
    st.push(2);
    st.push(3);

    while (!st.isEmpty()) {
      System.out.println(st.peek());
      st.pop();
    }

  }

}
