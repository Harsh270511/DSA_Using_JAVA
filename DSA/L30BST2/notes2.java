//Convert BST to Balanced BST
package ApnaCollege.L30BST2;

import java.util.*;

public class notes2 {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;

    }
  }

  public static void preOrder(Node root) {
    if (root == null) {
      return;

    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  // This fxn help to iterate in BST and put all the elements in sorted order
  // inside arraylist
  public static void getInOrder(Node root, ArrayList<Integer> inOrder) {
    if (root == null) {
      return;
    }
    getInOrder(root.left, inOrder);
    inOrder.add(root.data);
    getInOrder(root.right, inOrder);
  }

  // fxn to form a balanced BST
  public static Node balancedBST(ArrayList<Integer> arr, int start, int end) {
    if (start > end) {
      return null;
    }
    int mid = (start + end) / 2;
    Node root = new Node(arr.get(mid));
    root.left = balancedBST(arr, start, mid - 1);
    root.right = balancedBST(arr, mid + 1, end);
    return root;

  }

  // fxn to create BST
  public static Node createBST(Node root) {
    // Inorder sequence
    ArrayList<Integer> inOrder = new ArrayList<>();
    getInOrder(root, inOrder);
    // sorted inOrder--> Balanced BST
    root = balancedBST(inOrder, 0, inOrder.size() - 1);
    return root;
  }

  public static void main(String[] args) {
    Node root = new Node(8);
    root.left = new Node(6);
    root.left.left = new Node(5);
    root.left.left.left = new Node(3);
    root.right = new Node(10);
    root.right.right = new Node(11);
    root.right.right.right = new Node(12);

    root = createBST(root);
    preOrder(root);
  }
}
