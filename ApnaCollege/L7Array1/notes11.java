//multiplication table
package ApnaCollege.L7Array1;
import java.util.Scanner;
public class notes11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: " );
    int num= sc.nextInt();

    for(int i=1; i <=10; i++){
      int table= num * i;
      System.out.println(num +" X "+ i +" = "+ table);
    }
  }
}
