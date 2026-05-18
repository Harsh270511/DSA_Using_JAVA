//the formation of the linkedlist kindly read it properly
package ApnaCollege.L20LinkedList1;

public class LinkedList {
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
  public static int size;// size of the linkedlist

  // add first
  // assuming jb node 1 ya 1 se jyda hain & agr koi node nhi hoga to ushke liye if
  // condition
  public void addFirst(int data) {
    // step 1: create new node
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    // step 2: assign newNode to the head
    newNode.next = head;// link hua h naye node se old ke head se & head ka address newNode me jayga
    // step 3: head = newNode
    head = newNode;
  }

  // add last
  public void addlast(int data) {
    // step 1: create new Node
    Node newNode1 = new Node(data);
    size++;
    if (head == null) {// by convension if head is null then linkedlist be null but we also write tail== null
      head = tail = newNode1;
      return;
    }
    // step 2: point tail.next to newNode1
    tail.next = newNode1;
    // step 3: tail = null
    tail = newNode1;
  }

// function for printing the LinkedList
  public void printLL() {
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

  // Add in the middle
  public void addNode(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    // i = idx-1 --> previous
    newNode.next = temp.next;
    temp.next = newNode;
  }

  // Remove First in a linked list
  public int removeFirst() {
    // edge case if size of the LL is 0
    if (size == 0) {
      System.out.println("LL is Empty");
      return Integer.MIN_VALUE;
    }
    // This is the case when the size will be 1 then head and tail will be same
    else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }

  // Remove last in the Linked List
  public int removeLast() {
    if (size == 0) {
      System.out.println("LL is empty");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    Node prev = head;
    for (int i = 0; i < size - 2; i++) {
      prev = prev.next;
    }
    int val = prev.next.data;// tail.data
    prev.next = null;
    tail = prev;
    size--;
    return val;
  }

  // Search(Iterative)
  public int IteSearch(int key) {
    Node temp = head;
    int i = 0;
    while (temp != null) {
      if (temp.data == key) {
        return i;
      }
      temp = temp.next;
      i++;
    }
    return -1;
  }

  // search Recursive
  public int helper(Node head, int key) {
    if (head == null) {
      return -1;
    }
    if (head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    if (idx == -1) {
      return -1;
    }
    return idx + 1;
  }

  public int recSearch(int key) {
    return helper(head, key);
  }

  public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  // Palindrome vala problem using slow-fast pointer

  // this is the way to find the mid node of the linkedlist

  public Node findMid(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next; // +1
      fast = fast.next.next; // +2

    }
    return slow;// slow is my mid node
  }

  public boolean checkPalindrome(Node head) {
    if (head == null || head.next == null) {
      return true;
    }
    // step 1: Mid
    Node midNode = findMid(head);// mid ke liye findMid fxn likha hua h

    // step2 : 2nd Half ko reverse
    Node prev = null;
    Node curr = midNode;
    Node next;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    Node right = prev;
    Node left = head;

    // step3: check if 1st half == 2nd half
    while (right != null) {
      if (right != left) {
        return false;
      }
      left = left.next;
      right = right.next;
    }
    return true;
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addlast(1);
    // ll.addlast(2);
    ll.printLL();

    // adding in the middle(middle mtlb kisi bhi Node ke bich me newNode ko add krna
    // ll.addNode(2, 3);//few data is changes becz of some new operations

    // finding the size of the LL
    // System.out.println(ll.size);//size of the

    // remove first
    // ll.removeFirst();//calling the removeFirst function
    // ll.printLL();//printling the new Node after the removeFirst
    // System.out.println("Size after the removeFirst : "+ll.size);

    // remove last
    // ll.removeLast();
    // ll.printLL();
    // System.out.println("Size after the removeLast: "+ll.size);

    // Iterative search calling
    // System.out.println(ll.IteSearch(9));
    // System.out.println(ll.IteSearch(5));

    // recursive function calling
    // System.out.println(ll.recSearch(1)); //will return 0
    // System.out.println(ll.recSearch(8)); //will return -1

    // Reverse the linkedlist
    // ll.reverse();
    // ll.printLL();

    // calling palindrome fxn
    System.out.println(ll.checkPalindrome(head));
  }

}
