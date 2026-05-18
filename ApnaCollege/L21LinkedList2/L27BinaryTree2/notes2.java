//Diameter of the a Tree approach number 2--> T.C = O(n)
package ApnaCollege.L21LinkedList2.L27BinaryTree2;

public class notes2 {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.right = null;
      this.left = null;
    }
  }

  static class Info {
    int diam;
    int height;

    Info(int diam, int height) {
      this.diam = diam;
      this.height = height;
    }
  }

  public static Info diameter(Node root) {
    // base case
    if (root == null) {
      return new Info(0, 0);
    }
    Info leftInfo = diameter(root.left);
    Info rightInfo = diameter(root.right);
    int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.height + rightInfo.height + 1);
    int hgt = Math.max(leftInfo.height, rightInfo.height) + 1;
    return new Info(diam, hgt);

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
    System.out.println("The diameter of the tree is : " + diameter(root).diam);
  }
}
