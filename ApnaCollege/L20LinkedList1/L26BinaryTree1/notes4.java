//sum of the nodes
package ApnaCollege.L20LinkedList1.L26BinaryTree1;

public class notes4 {
  static class Node{
    int data;
    Node left, right;

    Node(int data){
      this.data= data;
      this.left = null;
      this.right = null;
    }
  }
  public static int sum(Node root){
    if(root == null){
      return 0;
    }
    int lsum = sum(root.left);
    int rSum = sum(root.right);
    int treeSum = lsum+ rSum+ root.data;
    return treeSum;
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left= new Node(4);
    root.left.right = new Node(5);
    root.right.right= new Node(7);
    root.right.left = new Node(6);
    System.out.println("The sum of the node of the tree is : "+ sum(root));
  }
}
