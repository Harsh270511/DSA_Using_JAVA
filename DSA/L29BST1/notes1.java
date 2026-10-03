//InOrder Traversal of BST gives a sorted sequence
package ApnaCollege.L29BST1;

public class notes1 {
  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
  public static void inOrder(Node root){
    if(root==null){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
  }
  public static void main(String[] args) {
    Node root = new Node(4);
    root.left=new Node(2);
    root.left.left= new Node(1);
    root.left.right= new Node(3);
    root.right=new Node(5);
    root.right.right= new Node(6);
    inOrder(root);
  }
}
