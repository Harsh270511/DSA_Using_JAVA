
package L20LinkedList1;

public class notes2 {
  public static class Node {
    public int data;
    public Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  // Add a node at the beginning
  public static void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // Add a node at the end
  public static void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  // Delete Nth node from the end
  public static void deleteNthEnd(int n) {
    // calculate size
    int sz = 0;
    Node temp = head;
    while (temp != null) {
      temp = temp.next;
      sz++;
    }

    if (n > sz) {
      System.out.println("Position out of range!");
      return;
    }

    // corner case → delete head
    if (n == sz) {
      head = head.next;
      return;
    }

    // find (sz - n)th node (previous node)
    int i = 1;
    int iToFind = sz - n;
    Node prev = head;
    while (i < iToFind) {
      prev = prev.next;
      i++;
    }

    // delete node
    prev.next = prev.next.next;

    // update tail if last node deleted
    if (prev.next == null) {
      tail = prev;
    }
  }

  public static void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    notes2 ll = new notes2();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(4);
    ll.addLast(5);
    System.out.println("Before deletion:");
    ll.printList();

    ll.deleteNthEnd(3);

    System.out.println("After deletion:");
    ll.printList();
  }
}

