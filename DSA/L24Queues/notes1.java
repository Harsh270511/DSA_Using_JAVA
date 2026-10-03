//Implementation of Array in Queue without circular queue
package ApnaCollege.L24Queues;

public class notes1 {
  static class Queue{
    static int[] arr;
    static int size;
    static int rear;

    Queue(int n){
      arr= new int[n];
      size =n;
      rear=-1;
    }
    //function for isEmpty
    public static boolean isEmpty(){
      return rear ==-1;
    }
    //function for isFull
    public static boolean isFull(){
      return rear==size -1;
    }
    //add function in Array
    public static void Add(int data){
      if(isFull()){
        System.out.println("Queue is full");
        return;
      }
      rear = rear+1;
      arr[rear]= data;
    }
    //remove function in Array
    public static int Remove(){
      if(isEmpty()){
        System.out.println("Empty queue");
        return -1;
      }
      int front= arr[0];
      for(int i=0; i < rear ; i++){
        arr[i] = arr[i+1];
      }
      rear = rear-1;
      return front;
    }
    //peek function in Array
    public static int Peek(){
      if(isEmpty()){
        System.out.println("Empty queue");
        return -1;
      }
      return arr[0];
    }
    
  }
  public static void main(String[] args) {
    Queue q = new Queue(5);
    q.Add(1);
    q.Add(2);
    q.Add(5);

    while(!q.isEmpty()){
      System.out.println(q.Peek());
      q.Remove();
    }
  }
}
