//Question number 3>>>>
package ApnaCollege.L24Queues;
import java.util.*;

public class notes6 {
  static class Stack{
    static Queue<Integer> q1= new LinkedList<>();
    static Queue <Integer> q2 = new LinkedList<>();

    public static boolean isEmpty(){
      return q1.isEmpty() && q2.isEmpty();
    }
    //add
    public static void push(int data){
      if(!q1.isEmpty()){
        q1.add(data);
      }else{
        q2.add(data);
      }
    }
    
    //remove
    public static int pop(){
      if(isEmpty()){
        System.out.println("stack is empty");
        return -1;
      }
      int top=-1;
      //case 1
      if(!q1.isEmpty()){
        while (!q1.isEmpty()) {
          top = q1.remove();
          if(q1.isEmpty()){
            break;
          }
          q2.add(top);
          
        }
      }else{//case 2
        if(!q2.isEmpty()){
          while (!q2.isEmpty()) {
            top = q2.remove();
            if(q2.isEmpty()){
              break;
            }
            q1.add(top);
            
          }
        }
      }
      return top;
    }

    //peek
    public static int peek(){
      if(isEmpty()){
        System.out.println("stack is empty");
        return -1;
      }
      int top=-1;
      //case 1
      if(!q1.isEmpty()){
        while (!q1.isEmpty()) {
          top = q1.remove();
          
          q2.add(top);
          
        }
      }else{//case 2
        if(!q2.isEmpty()){
          while (!q2.isEmpty()) {
            top = q2.remove();
            
            q1.add(top);
            
          }
        }
      }
      return top;
    }

  }
  public static void main(String[] args) {
    Stack s= new Stack();
    s.push(100);
    s.push(200);
    s.push(300);

    while(!s.isEmpty()){
      System.out.println(s.peek());
      s.pop();
    }

  }
}
