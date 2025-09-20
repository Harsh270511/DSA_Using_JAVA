package lecture_6;

public class notes3 {
  public static void swap(int x, int y){
    x= x ^ y;
    y = x ^ y;
    x = x ^ y;
    

  }
  public static void main(String[] args) {
    int a= 5;
    int b=10;
    swap(a, b);
    System.out.println(a);
    System.out.println(b);
  }
  
}
