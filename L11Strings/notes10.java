package L11Strings;

public class notes10 {
  public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1; i< str.length(); i++){
      //empty space ke liye if condition lgaya hu 
      //agr empty space mile to  use copy kr do sb.append(str.charAt(i))
      if(str.charAt(i)==' ' && i < str.length()-1){
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));// itna (Character.toUpperCase(str.charAt(i))) hame upper case return kr rha hai

      }else{
        sb.append(str.charAt(i));
      }
    }
    return sb.toString();
  }
  public static void main(String[] args) {
    String name= "hi, my name is harsh maurya";
    System.out.println(toUpperCase(name));
  }
}
