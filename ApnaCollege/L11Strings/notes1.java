package ApnaCollege.L11Strings;

//import java.util.Scanner;

public class notes1 {

  // to print the character of the string we use this function
  public static void printString(String str) {
    for (int i = 0; i < str.length(); i++) {
      System.out.print(str.charAt(i) + " ");

    }
    
  }

  public static void main(String[] args) {
    // char ch[] = { 'a', 'b', 'c', 'd' };
    // String str = "abcd1!@#$%^&*()<>?";
    // String st = new String("xyz");

    // Taking input from the user in String format
    // Scanner sc = new Scanner(System.in);

    // String name0= sc.next();//print only one words ignore spaces
    // String name =sc.nextLine();//print the whole sentences include the spaces

    // System.out.println(st.length());//length is the function in String but
    // properties in array

    // concatination
    String firstName = "Harsh";
    String lastName = "maurya";
    String fullName = firstName + " " + lastName;
    // System.out.println(fullName);

    // getting the value of the String using .charAt() is the property in String to
    // get the character
    // System.out.println(fullName.charAt(5));

    printString(fullName);// calling the printString function
  }

}
