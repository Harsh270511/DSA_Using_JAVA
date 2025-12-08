//reverse the string using a stack
package L22Stack1;
import java.util.*;
public class notes5 {
  
  public static String reverse(String str){
    Stack<Character> ch = new Stack<>();
    int idx=0;
    while(idx < str.length()){
      ch.push(str.charAt(idx));
      idx++;
    }
    StringBuilder result= new StringBuilder("");
    while (!ch.isEmpty()) {
      char curr= ch.pop();
      result.append(curr);
    }
    return result.toString();
  }
  public static void main(String[] args) {
    String str= "abcde";
    String result = reverse(str);
    System.out.println(result);
  }
}
