package L5FxnAndMethod;

import java.util.Scanner;

public class notes1 {
  // function1 name is printName
  public static void printName() {
    System.out.println("Harsh Maurya");
    return;// void hai to return hei bss likho ya fr kuch mt likho
  }

  // function2 name is calSum
  // kuki int a and b main function ke andr define hai to hum as a parameter int a
  // and int b to apne function me use kr sakte hain
  public static int calSum(int a, int b) {

    /*
     * Scanner sc = new Scanner(System.in);
     * // a = sc.nextInt();
     * b = sc.nextInt();
     * yaha pr hum agr Scanner vale pure objects ko define kre and parameter me bhi
     * int a, int b ko define kr de tb input lete time pr hame bss a= sc.nextInt()
     * hei likhna hai same as for b
     */
    int sum = a + b;
    return sum;// function return kr rha hai sum joki ek integer value hai aur vo return usse kr rha hai jo use call kr rha ho jaysi ki yaha pr main function hei call kr rha hai to main function ko calSum se ek integer value return hogi 
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    // printName();//function calling
    int printSum =calSum(a, b);// two parameters hain calSum fxn me to 2 hei inputs lega 
    /*jo upr function calSum me sum use hua hai aur yaha pr jo printSum use hua hai 2no alg hain due to local variable to kbhi bhi agr printSum ki jgh sum likha ho to ye mt samjhna ki 2no sum same hai kuki yaha pr calSum se value jo bhi aa rhi h ushke assigment operator(=) ki help se assign hum printSum me kr rhy mtbl store kr rhy hain aur fr ush stor value(printSum) ko hei hum print bhi kr rhy hain */
    System.out.println(printSum);
  }

}
