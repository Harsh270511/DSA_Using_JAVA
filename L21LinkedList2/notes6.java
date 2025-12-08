//Doubly linkedlist
package L21LinkedList2;

public class notes6 {
  public  class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
      this.data= data;
      this.next= null;
      this.prev= null;
    }
  }
  public static Node head;
  public static Node tail;
  public static int size;

  //add
  public void addFirst(int data){
    Node newNode = new Node(data);
    size++;
    if(head == null){
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head.prev = newNode;
    head = newNode;
  }
  //remove-removelast
  public int removeFirst(){
    if(head == null){
      System.out.println("Dll is null");
      return Integer.MIN_VALUE;
    }
    if(size ==1){
      int val = head.data;
      head = tail = null;
      size--;
      return val;
    }
    int val = head.data;
    head = head.next;
    head.prev= null;
    size--;
    return val;
  }
  //print
  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+ "<-->");
      temp = temp.next;
    }System.out.println("null");
  }


  //function to reverse the doubley linkedlist
  public void reverseDLL(){
    Node curr= head;
    Node prev= null;
    Node next;
    while(curr != null){
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      prev = curr;
      curr= next;

    }
    head = prev;
  }


  public static void main(String[] args) {
    notes6 dll = new notes6();//class ke naam se hoga
    dll.addFirst(3);
    dll.addFirst(2);
    dll.addFirst(1);
//for double linkedlist
    // dll.print();
    // System.out.println(dll.size);

    // dll.removeFirst();
    // dll.print();
    // System.out.println(dll.size);


//for reverse double linkedlist
    dll.print();
    dll.reverseDLL();;
    dll.print();
  }
}
