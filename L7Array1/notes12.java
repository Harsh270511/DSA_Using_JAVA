
package L7Array1;
import java.util.Scanner;

public class notes12 {
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    int evenNum= 0;
    int oddNum=0;
    int num;
    int choice ;
    do{
      System.out.print("Enter your number: ");
      num =sc.nextInt();

      if(num % 2==0){
        evenNum += num;
      }else{
        oddNum += num;
      }

      System.out.println("Enter your choice is you wants to continue, if yes type 1 & if no type 0: ");

      choice = sc.nextInt();
    }while(choice ==1);
    System.out.println("Sum of even number is: "+ evenNum);
    System.out.println("Sum of odd number is: "+ oddNum);

    

    

    
  }
  
}
