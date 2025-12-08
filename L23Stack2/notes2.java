//Duplicates paranthese

package L23Stack2;
import java.util.*;
public class notes2 {

  public static boolean isDuplicate(String str){

    Stack<Character> s= new Stack<>();
    for(int i=0; i< str.length(); i++){
      char ch = str.charAt(i);

      //closing condition
      if(ch ==')'){
        int count=0;
        while(s.pop() != '('){
          
          count++;
        }
        if(count < 1){
          return true;//means duplicated exists
        }
      }else{
        //opening condition
        s.push(ch);
      }
    }
    return false;
  }
  public static void main(String[] args) {
    String str1 = "((a+b))";//return true
    String str2 = "((a+ b) + (c+d))";//return false
    System.out.println(isDuplicate(str2));
  }
}
