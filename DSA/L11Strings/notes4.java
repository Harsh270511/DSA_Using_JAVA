package ApnaCollege.L11Strings;

public class notes4 {
  public static void main(String[] args) {
    String s1 = "Harsh";
    String s2= "Harsh";
    String s3 = new String("Harsh");

    if(s1 == s2 ){
      System.out.println("Equal");
    }
    else if( s1 == s3){
      System.out.println("not equals");
    }

    //using of the .equals() function to check the value only not the memory location
    if(s1.equals(s3)){
      System.out.println("Dot equals se equal hai");
    }else{
      System.out.println("not equals with Dot");
    }
  }
}
