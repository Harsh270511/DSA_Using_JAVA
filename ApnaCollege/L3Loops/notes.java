package ApnaCollege.L3Loops;

import java.util.Scanner;

public class notes {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Please enter your salary in Rupees: ");
    double salary= sc.nextDouble();
    

    if(salary > 100000){
      System.out.println("You have to pay 30% tax of your total income");
      double tax=salary * 0.3;
      System.out.println("Now you have to pay : "+ tax);
    }else if(salary >=500000 & salary < 100000){
      System.out.println("You have to pay 20% tax of your total income");
      double tax=salary * 0.20;
      System.out.println("Now you have to pay : "+ tax);

    }
    else{
      System.out.println("You have to pay 0% tax of your income");
      double tax=0 ;
      System.out.println("Now you have to pay : "+ tax);
    }

  }
  
}
