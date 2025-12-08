//merge sort in linkedlist
//ek baar deykh lena code kuch issues hain samjhne me
package L21LinkedList2;

public class notes4 {

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
  public void printLL() {
    if (head == null) {
      System.out.println("The LinkedList is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "-->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  // getMid function
  private Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  // merge function
  private Node merge(Node head1, Node head2) {
    Node mergeLL = new Node(-1);
    Node temp = mergeLL;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
      }
      temp = temp.next;
    }

    // attach remaining nodes
    if (head1 != null) temp.next = head1;
    if (head2 != null) temp.next = head2;

    return mergeLL.next;
  }

  // mergeSort function
  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node mid = getMid(head);
    Node rightHead = mid.next;
    mid.next = null;

    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    return merge(newLeft, newRight);
  }

  // function to add node at the beginning
  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // function to add node at the end
  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  // main method
  public static void main(String[] args) {
    notes4 ll = new notes4();

    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addLast(4);
    ll.addFirst(5);

    System.out.println("Original LinkedList:");
    ll.printLL();

    ll.head = ll.mergeSort(ll.head);

    System.out.println("Sorted LinkedList:");
    ll.printLL();
  }
}
