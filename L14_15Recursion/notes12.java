package L14_15Recursion;
public class notes12 {
  public static void removeDuplicates(String str, boolean map[], StringBuilder newStr,int index){
    //base case
    if(index == str.length()){
      System.out.println(newStr);
      return;
    }
    //kaam 
    char currentChar = str.charAt(index);
    if(map[currentChar-'a']==true){
      //duplicates
      removeDuplicates(str, map, newStr, index+1);
    }else{
      map[currentChar-'a']=true;
      removeDuplicates(str, map, newStr.append(currentChar), index+1);
    }
  }
  public static void main(String[] args) {
    String name= "appnacollege";
    removeDuplicates(name, new boolean[26], new StringBuilder(""), 0);
  }
}
