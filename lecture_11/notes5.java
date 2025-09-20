package lecture_11;

public class notes5 {
  //si= starting Index; ei = Ending index this is excluded
  public static String printSubString(String str, int si, int ei){
    String subStr= "";
    for(int i=si; i< ei ;i++){
      subStr += str.charAt(i);
    }
    return subStr;
  }
  public static void main(String[] args) {
    String subStr= "Harsh Maurya";
    //System.out.println(printSubString(subStr, 1, 7)); this is defined my user

    //predefined substring present in java ( .subString(si, ei)) is present in java
    System.out.println(subStr.substring(0, 8));
  }
  
}
