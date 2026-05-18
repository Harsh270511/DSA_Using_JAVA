//it will count that how much times a character is their
package ApnaCollege.L11Strings;

public class notes11 {
  public static String compress(String str){
    String newStr= "";
    for(int i=0; i<str.length(); i++){
      Integer cnt =1;
      while(i<str.length()-1 && str.charAt(i)==str.charAt(i + 1)){
        cnt++;
        i++;
      }
      newStr += str.charAt(i);
      if(cnt > 0){
        newStr += cnt.toString();
      }
    }
    return newStr;
  }
  public static void main(String[] args) {
    String str= "aabbcc";
    System.out.println(compress(str));
  }
}
