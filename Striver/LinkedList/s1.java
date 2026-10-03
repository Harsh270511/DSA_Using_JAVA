package Striver.LinkedList;
public class s1 {
  static class Node{
    int data;
    Node next;


    Node(int data, Node next){
      this.data= data;
      this.next=next;
    }
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static void main(String[] args) {
    int[] arr={1,2,44,5};
    Node s=new Node(arr[0]);
    System.out.println(s.data);
    
  }
}
