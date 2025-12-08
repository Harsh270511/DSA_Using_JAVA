//Count root node 
package L26BinaryTree1;

public class notes3 {
  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data= data;
      this.right =null;
      this.left = null;
    }
  }
  public static int countNode(Node root){
    if(root== null){
      return 0;
    }
    int lcount= countNode(root.left);
    int rCount = countNode(root.right);
    int treeCount = lcount + rCount+ 1;
    return treeCount;
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left= new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.right= new Node(6);

    System.out.println("The total number of Node in a tree is: "+countNode(root));
  }
}
