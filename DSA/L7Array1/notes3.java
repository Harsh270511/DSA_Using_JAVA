
package ApnaCollege.L7Array1;
import java.util.Scanner;

public class notes3 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt();
    
    int sum= 0;
    int val= 1;

    while(val <= num){
      sum += val;
      
      val++;
    }System.out.println(sum);
  }
  
}
