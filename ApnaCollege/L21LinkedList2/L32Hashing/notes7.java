//Valid Anagram
package ApnaCollege.L21LinkedList2.L32Hashing;
import java.util.*;
public class notes7 {
  public static boolean isAnagram(String s, String t){
    //Edge case
    if(s.length() != t.length()){
      return false;
    }
    HashMap<Character , Integer> map = new HashMap<>();
    for(int i =0; i < s.length(); i++){
      char ch = s.charAt(i);
      map.put(ch , map.getOrDefault(ch, 0) + 1);
    }
    for(int j =0; j < t.length(); j++){
      char ch = t.charAt(j);
      if(map.get(ch) != null){
        if(map.get(ch)==1){
          map.remove(ch);
        }else{
          map.put(ch, map.get(ch)- 1);
        }
      }else{
        return false;
      }
    }
    return map.isEmpty();
    
  }
  public static void main(String[] args){//O(n)where n is number of char in the string
    String s= "race";
    String t= "care";
    boolean ans = isAnagram(s, t);
    System.out.println(ans);
  }
}
