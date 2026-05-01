// Binary tree basic pre-order, in-order, post-order, level-order
package L26BinaryTree1;

import java.util.*;

public class notes1 {

  // Node class
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
      this.data = val;
      this.left = null;
      this.right = null;
    }
  }

  // BinaryTree class
  static class BinaryTree {
    static int idx = -1;

    public static Node buildtree(int[] nodes) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }

      Node newNode = new Node(nodes[idx]);
      newNode.left = buildtree(nodes);
      newNode.right = buildtree(nodes);

      return newNode;
    }

    // Preorder traversal function T.C= O(n)
    public static void preOrder(Node root) {
      if (root == null) {
        // System.out.print("-1 ");//this will give o/p as (1 2 4 -1 -1 5 -1 -1 3 -1 6
        // -1 -1)
        return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }

    // InOrder traversal function T.C =O(n)
    public static void inOrder(Node root) {
      if (root == null) {
        return;
      }
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);

    }

    // PostOrder traversal function T.C = O(n)
    public static void postOrder(Node root) {
      if (root == null) {
        return;
      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    }

    // Level Order traversal T.C= O(n)
    public static void levelOrder(Node root) {
      if (root == null) {
        return;
      }
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      while (!q.isEmpty()) {
        Node currNode = q.remove();
        if (currNode == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;
          } else {
            q.add(null);
          }
        }else{
          System.out.print(currNode.data + " ");
          if (currNode.left != null) {
            q.add(currNode.left);
          }
          if (currNode.right != null) {
            q.add(currNode.right);
          }
        }
      }
    }

  }

  // Main method
  public static void main(String[] args) {
    int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    BinaryTree tree = new BinaryTree();
    Node root = tree.buildtree(nodes);

    System.out.println("Preorder Traversal:");
    tree.preOrder(root);
    System.out.println();

    System.out.println("Inorder Traversal");
    tree.inOrder(root);
    System.out.println();

    System.out.println("PostOrder Traversal");
    tree.postOrder(root);
    System.out.println();

    System.out.println("Level order traversal");
    tree.levelOrder(root);
  }
}
