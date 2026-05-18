package ApnaCollege.L7Array1;
import java.util.Scanner;

public class notes7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do{
      System.out.print("Enter the Random number: ");
      int num= sc.nextInt();
      if(num %10 ==0){
        break;
      }
      System.out.println(num);
    }
    while(true);
  }
}
