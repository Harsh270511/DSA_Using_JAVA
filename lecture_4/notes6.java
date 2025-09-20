package lecture_4;
import java.util.Scanner;
public class notes6 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);// for taking input we define System.in
    System.out.print("Enter the you wants to reverse: ");//this is for user friendly purpose
    int num= sc.nextInt();
    //num =1234
    int reverse =0;
    while(num > 0){
      int digit = num % 10;//So that i took a last digit of any number
      num = num /10;// so that the number is left after removal of last digit
      reverse = reverse * 10 + digit;
    }
    System.out.println(reverse);
  }
  
}
