//Implementation of Array in Queue with circular queue
package L24Queues;

public class notes2 {
  static class Queue {
    static int[] arr;
    static int size;
    static int rear;
    static int front;

    Queue(int n) {
      arr = new int[n];
      size = n;
      rear = -1;
      front = -1;
    }

    public static boolean isEmpty() {
      return rear == -1 && front == -1;
    }

    public static boolean isFull() {
      return (rear + 1) % size == front;// mtlb jayse hei hamne next element to enter krya vayse hei udr front aa gya mtlb array bhar gya h
    }

    // add function in Array
    public static void Add(int data) {
      if (isFull()) {
        System.out.println("Queue is full");
        return;
      }
      // add function
      if (front == -1) {
        front = 0;
      }
      rear = (rear + 1) % size;
      arr[rear] = data;
    }

    // remove function in Array
    public static int Remove() {
      if (isEmpty()) {
        System.out.println("Empty queue");
        return -1;
      }
      int result = arr[front];
      if (rear == front) {
        rear = front = -1;
      } else {
        front = (front + 1) % size;
      }
      return result;
    }

    // peek function in Array
    public static int Peek() {
      if (isEmpty()) {
        System.out.println("Empty queue");
        return -1;
      }
      return arr[front];
    }

  }

  public static void main(String[] args) {
    Queue q = new Queue(5);
    q.Add(1);
    q.Add(2);
    q.Add(3);
    System.out.println(q.Remove());
    q.Add(4);
    System.out.println(q.Remove());
    q.Add(5);



    while (!q.isEmpty()) {
      System.out.println(q.Peek());
      q.Remove();
    }
  }
}
