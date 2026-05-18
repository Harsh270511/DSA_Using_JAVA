//Insert & search in tries 
package ApnaCollege.L33Tries;

public class notes1 {
  static class Node {
    Node[] children = new Node[26];
    boolean endOfWord = false;

    Node() {
      for (int i = 0; i < 26; i++) {
        children[i] = null;
      }
    }

  }

  public static Node root = new Node();

  // Insertation in trie & T.C = O(L) where L is the length of the largest word
  public static void insert(String word) {
    Node curr = root;
    for (int level = 0; level < word.length(); level++) {
      int idx = word.charAt(level) - 'a';
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();
      }
      curr = curr.children[idx];
    }
    curr.endOfWord = true;
  }

  // Search in trie & T.C=O(L) where L is the length of the largest word
  public static boolean Search(String key) {
    Node curr = root;
    for (int level = 0; level < key.length(); level++) {
      int idx = key.charAt(level) - 'a';
      if (curr.children[idx] == null) {
        return false;
      }
      curr = curr.children[idx];
    }
    return curr.endOfWord == true;
  }

  public static void main(String[] args) {
    String[] word = { "the", "a", "there", "their", "any", "thee" };
    // calling for inser
    for (int i = 0; i < word.length; i++) {
      insert(word[i]);
    }
    System.out.println(Search("their"));
    System.out.println(Search("thee"));
  }
}
