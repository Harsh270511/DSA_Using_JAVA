//Valid parantheses with T.C=O(n);
package ApnaCollege.L23Stack2;
import java.util.*;
public class notes1 {
  public static boolean isValid(String str){
    Stack<Character> c= new Stack<>();

    for(int i=0; i< str.length();i++){
      char ch = str.charAt(i);

      //opening
      if(ch =='(' || ch =='{' ||ch =='['){
        c.push(ch);
      }else{
        if(c.isEmpty()){
          return false;
        }
        if((c.peek()=='(' && ch==')')// ()
          || (c.peek()=='{' && ch =='}')// {}
          || (c.peek()=='[' && ch==']'))// []
          {c.pop();
        }else{
          return false;
        }
      }
    }
    if(c.isEmpty()){
      return true;
    }else{
      return false;
    }
  }
  public static void main(String[] args) {
    String str = "({})[]}";
    System.out.println(isValid(str));
  }
}
