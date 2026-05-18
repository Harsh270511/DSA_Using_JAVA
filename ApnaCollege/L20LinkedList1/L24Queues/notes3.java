//Question number 1

package ApnaCollege.L20LinkedList1.L24Queues;
public class notes3 {
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
    static class Queue1 {
      static Node head = null;
      static Node tail = null;

      public static boolean isEmpty() {
        return head == null && tail == null;
      }

      // add
      public static void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
          head = tail = newNode;
          return;
        }
        tail.next = newNode;
        tail = newNode;
      }

      // remove
      public static int Remove() {
        if (isEmpty()) {
          System.out.println("Queue is empty");
          return -1;
        }
        int front = head.data;
        // single element
        if (tail == head) {
          tail = head = null;
        } else {
          head = head.next;
        }
        return front;
      }

      public static int peek() {
        if (isEmpty()) {
          System.out.println("Queue is empty");
          return -1;
        }
        return head.data;
      }
    
  }

  public static void main(String[] args) {
    Queue1 q = new Queue1();
    q.add(1);
    q.add(2);
    q.add(3);

    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.Remove();
    }

  }
}
