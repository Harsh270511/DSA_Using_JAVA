//zig-zag linked list
//ek baar deykh lena code kuch issues hain samjhne me
package L21LinkedList2;


public class notes5 {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  // function for printing the LinkedList
  public void print() {
    if (head == null) {
      System.out.print("The LinkedList is empty");
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " → ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void zigZag() {
    // mid
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    Node mid = slow;
    // reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;
    // alternate merging --> zig-zag
    while (left != null && right != null) {
      nextL = left.next;
      left.next = right;
      nextR = right.next;
      right.next = nextL;
      right = nextR;
      left = nextL;
    }
  }

  public static void main(String[] args) {
    notes5 ll = new notes5();
    // ll.addLast(1);
    // ll.addLast(2);
    // ll.addLast(3);
    // ll.addLast(4);
    // ll.addLast(5);

    ll.print();

  }

  
}
