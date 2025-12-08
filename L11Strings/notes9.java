package L11Strings;

public class notes9 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("");// initialized with empty String
    for (char ch = 'a'; ch <= 'z'; ch++) {
      sb.append(ch + " ");// ek ke piche ek character append hota jayga
    }
    System.out.println(sb);// ab sb ko call krna aur print karna
  }

}
