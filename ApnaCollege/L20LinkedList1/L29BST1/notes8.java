//mirror of BST
package ApnaCollege.L20LinkedList1.L29BST1;

public class notes8 {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;

    }

  }

  public static Node mirrorBST(Node root) {
    if (root == null) {
      return null;
    }
    Node leftMirror = mirrorBST(root.left);
    Node rightMirror = mirrorBST(root.right);
    root.right = leftMirror;
    root.left = rightMirror;
    return root;
  }
  public static void preOrder(Node root){
    if(root==null){
      return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(8);
    root.left = new Node(5);
    root.right = new Node(10);
    root.left.left = new Node(3);
    root.left.right = new Node(6);
    root.right.right = new Node(11);
    
    root= mirrorBST(root);
    preOrder(root);

  }
}
