//implement the stack using java collection framework
package ApnaCollege.L22Stack1;

import java.util.*;

public class notes3 {
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    while (!s.isEmpty()) {
      System.out.println(s.pop());
      s.peek();
    }
  }
}
