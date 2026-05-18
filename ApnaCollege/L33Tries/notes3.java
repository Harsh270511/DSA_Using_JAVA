//Prefix problem
package ApnaCollege.L33Tries;

public class notes3 {
  // Node class
  static class Node {
    Node[] children = new Node[26];
    boolean eow = false;
    int freq;

    Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
      }
      freq = 1;
    }
  }

  // insert method
  public static Node root = new Node();

  public static void insert(String word) {
    Node curr = root;
    for (int level = 0; level < word.length(); level++) {
      int idx = word.charAt(level) - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();
      } else {
        curr.children[idx].freq++;
      }
      curr = curr.children[idx];
    }
    curr.eow = true;

  }

  // findPrefix method
  public static void findPrefix(Node root, String ans) {
    // base case1
    if (root == null) {
      return;
    }
    // base case2;
    if (root.freq == 1) {
      System.out.print(ans+" ");
      return;
    }
    Node curr = root;
    for (int i = 0; i < root.children.length; i++) {
      if (curr.children[i] != null) {
        findPrefix(root.children[i], ans + (char) (i + 'a'));
      }
    }
  }

  public static void main(String[] args) {
    String[] arr = { "zebra", "dog", "duck", "dove" };

    for (int i = 0; i < arr.length; i++) {
      insert(arr[i]);
    }
    root.freq = -1;// taaki naye words ke liye starting mtlb root pr hei na ruk jaye
    findPrefix(root, "");
  }
}
