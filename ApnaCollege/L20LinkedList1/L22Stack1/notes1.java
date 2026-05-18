//here the program is implementing the stack concept with the arraylist

package ApnaCollege.L20LinkedList1.L22Stack1;

import java.util.ArrayList;

public class notes1 {
  static class Stack{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
      return list.size() == 0;
    }

    //push operator
    public static void push(int data){
      list.add(data);
    }

    //pop operator
    public static int pop(){
      //corner case if stack is empty
      if(isEmpty()){
        return -1;
      }
      int top = list.get(list.size()-1);//top will assigned with the last value of Arraylist
      list.remove(list.size()-1);//will remove the last index
      return top;//know we the value of top element in the stack
    }

    //peek operator
    public static int peek(){
      //corner case
      if(isEmpty()){
        return -1;
      }
      int top = list.get(list.size()-1);//hame bss last ki element ko return krna hota hai
      return top;
    }
  }
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(1);
    s.push(10);
    s.push(30);

    while(!s.isEmpty()){
      System.out.println(s.peek());
      s.pop();

    }
  }
}
