//Diameter of the a Tree approach number 1--> T.C = O(n^2)
package ApnaCollege.L27BinaryTree2;

public class notes1 {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  public static int Diameter(Node root) {
    if (root == null) {
      return 0;
    }
    int leftDiameter = Diameter(root.left);
    int leftheight = height(root.left);
    int rightDiameter = Diameter(root.right);
    int rightHeight = height(root.right);
    int selfDia = leftheight + rightHeight + 1;
    int maxDia = Math.max(Math.max(leftDiameter, rightDiameter), selfDia);
    return maxDia;
  }

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    int height = Math.max(lh, rh) + 1;
    return height;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.left.right.right = new Node(6);
    root.left.right.right.right = new Node(7);
    root.left.left.left = new Node(9);
    System.out.println("The Diameter of the tree is: " + Diameter(root));
  }
}
