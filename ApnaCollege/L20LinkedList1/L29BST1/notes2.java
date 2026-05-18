// Build a BST
package ApnaCollege.L20LinkedList1.L29BST1;

public class notes2 {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data < val) {
      // right insert
      root.right = insert(root.right, val);
    } else {
      // left insert
      root.left = insert(root.left, val);
    }
    return root;
  }
  public static void InOrder(Node root){
    if(root==null){
      return;
    }
    InOrder(root.left);
    System.out.print(root.data+" ");
    InOrder(root.right);
  }


  public static void main(String[] args) {
    int[] values = { 5, 1, 3, 4, 2, 7 };
    Node root = null;
    for(int i=0; i<values.length;i++){
      root= insert(root, values[i]);
    }
    InOrder(root);
    System.out.println();
  }
}
