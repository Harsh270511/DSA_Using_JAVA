//checking the palindrome either the string is palindrome or not
package L11Strings;

public class notes2 {
  public static boolean isPalindrome(String str) {

    for (int i = 0; i < str.length() / 2; i++) {

      if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
        // if is finding that any one character will not equal so that it would return
        // false
        return true;
      }

    }
    return false;
  }

  public static void main(String[] args) {
    String str = "madamjii";
    System.out.println(isPalindrome(str));

  }

}
