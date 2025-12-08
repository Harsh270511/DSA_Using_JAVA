package L13OOPs;

public class notes2 {
  public static void main(String[] args) {
    BankAccount myAcc = new BankAccount();//create a BankAccount object called myAcc
    myAcc.name ="Harsh";//the access modifier is public hence can be access throughout any class
    System.out.println(myAcc);
    //generate an error because password is private so access only within class
   // myAcc.password = "qwqhsd";

    myAcc.setPassword("Abcdefg");//we are created an setPassword and it is public so it give an access to change into private things like password

    
  }
}
class BankAccount{
  public String name;
  private String password;
  //we are setting the private (password) within the class
  public void setPassword(String pwd){
    password = pwd;

  }
}
