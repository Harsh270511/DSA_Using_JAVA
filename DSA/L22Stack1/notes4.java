//Push at the bottom of the stack
package ApnaCollege.L22Stack1;
import java.util.*;
public class notes4 {
  public static void pushAtBottom(Stack<Integer> s, int data){
    if(s.isEmpty()){
      s.push(data);
      return;
    }
    int top = s.pop();//upper jate time remove kre
    pushAtBottom(s, data);
    s.push(top);//niche ate time add kr le
  }
  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    pushAtBottom(s, 4);

    while(!s.isEmpty()){
      System.out.println(s.pop());
    }
  }
}
