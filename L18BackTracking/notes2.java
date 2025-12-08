//finding subset using backtracking
package L18BackTracking;

public class notes2 {
  public static void Findsubset(String str, String ans, int i) {
    // base case
    if (i == str.length()) {
      if (ans.length() == 0) {
        System.out.println("null");
      } else {
        System.out.println(ans);
      }
      return;
    }
    // recursion
    // 1) if choice is Yes
    Findsubset(str, ans + str.charAt(i), i + 1);
    // 2) if choice is No
    Findsubset(str, ans, i + 1);

  }

  public static void main(String[] args) {
    String name = "abc";
    Findsubset(name, "", 0);
  }
}
