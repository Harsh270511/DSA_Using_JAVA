package ApnaCollege.L13OOPs;

public class notes1 {
  public static void main(String[] args) {
    Pen p1= new Pen();//create a pen  object object called p1 amd Pen() is a construtor
    p1.SetColor("Blue");//using dot opertor the object properties or funtion would be called
    System.out.println(p1.color);//printing the color

    p1.setTip(5);// calling the setTip function using dot operator
    System.out.println(p1.tip);//printing the tip;
  }
}

//writing the class of for the pen 
class Pen{
  //Attributes
  String color;
  int tip;

  //functions/ behaviors for set color
  void SetColor(String newColor){
    color = newColor;
  }

  //function/behavior for set tip
  void setTip(int newTip){
    tip = newTip;
  }

}

//Class for student
class Student{
  //Attributes for student
  String name;
  int height;
  float percentage;

  //function which is associated with Attributes
  void calPercentage(int maths, int physics, int chem, int physical, int english){
    percentage = (maths + physical + physics + english + chem)/5;
  }

}
