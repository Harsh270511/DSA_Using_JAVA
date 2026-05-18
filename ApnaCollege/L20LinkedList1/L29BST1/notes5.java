//Print a range
package ApnaCollege.L20LinkedList1.L29BST1;

public class notes5 {
  static class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;

    }
  }

  // Function to Insert the value in form of BST
  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data < val) {
      root.right = insert(root.right, val);

    } else if (root.data > val) {
      root.left = insert(root.left, val);
    }
    return root;
  }

  // Function for the Inorder traversal
  public static void InOrder(Node root) {
    if (root == null) {
      return;
    }
    InOrder(root.left);
    System.out.print(root.data + " ");
    InOrder(root.right);
  }

  public static void printInRange(Node root, int k1, int k2) {
    // base case
    if (root == null) {
      return;
    }
    if (root.data >= k1 && root.data <= k2) {
      printInRange(root.left, k1, k2);
      System.out.print(root.data+" ");
      printInRange(root.right, k1, k2);
    } else if (root.data > k2) {
      printInRange(root.right, k1, k2);
    } else {
      printInRange(root.left, k1, k2);
    }

  }

  public static void main(String[] args) {
    int[] values = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
    Node root = null;
    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }
    InOrder(root);
    System.out.println();
    printInRange(root, 5 ,  12);
  }
}
