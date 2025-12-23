//StartsWith problem
package L33Tries;

public class notes4 {
  static class Node {
    Node[] children = new Node[26];
    boolean eow = false;

    Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
      }
    }
  }

  public static Node root = new Node();

  // Insert
  public static void insert(String words) {
    Node curr = root;
    for (int i = 0; i < words.length(); i++) {
      int idx = words.charAt(i) - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.eow = true;
  }

  public static boolean startWith(String prefix) {
    Node curr = root;
    for (int i = 0; i < prefix.length(); i++) {
      int idx = prefix.charAt(i) - 'a';
      if (curr.children[idx] == null) {
        return false;
      }
      curr = curr.children[idx];
    }
    return true;
  }

  public static void main(String[] args) {
    String[] arr = { "apple", "app", "man", "mango", "woman" };
    String prefix1= "app";//true
    String prefix2= "moon";//false

    for (int i = 0; i < arr.length; i++) {
      insert(arr[i]);
    }
    System.out.println(startWith(prefix1));
    System.out.println(startWith(prefix2));
  }

}
