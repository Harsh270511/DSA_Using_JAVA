//Max Area in Histogram: T.C== O(3n)--> O(n)
package L23Stack2;
import java.util.*;
public class notes3 {
  public static void maxArea(int[] arr){
    int maxArea= 0;
    int[] nsl= new int[arr.length];//next smaller left 
    int[] nsr= new int[arr.length];//next smaller right

    //next smaller right--> O(n)
    Stack<Integer> s = new Stack<>();
    for(int i=arr.length-1; i>=0; i--){
      while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
        s.pop();
      }
      if(s.isEmpty()){
        //index
        nsr[i]= arr.length;
      }else{
        //top
        nsr[i]= s.peek();
      }
      s.push(i);
    }
    //next smaller left --> O(n)
    s= new Stack<>();
    for(int i=0; i<arr.length; i++ ){
      while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
        s.pop();
      }
      if(s.isEmpty()){
        nsl[i]= -1;
      }else{
        nsl[i]= s.peek();
      }
      s.push(i);
    }

    //Maximum area width = j-i-1==> nsr[i] - nsl[i] -1 --> O(n)
    for(int i=0; i<arr.length; i++){
      int height= arr[i];
      int widht = nsr[i] - nsl[i]-1;
      int currArea= height * widht;
      maxArea = Math.max(currArea , maxArea);
    }
    System.out.println("Maximum area in the histogram is: "+ maxArea);
  }
  public static void main(String[] args) {
    int[] arr= {2,1,5,6,2,3};
    maxArea(arr);
  }
}
