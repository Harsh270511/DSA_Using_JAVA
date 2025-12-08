//Heap is not implemented as a Node class
package L31Heaps;
import java.util.*;
public class notes2 {
  static class Student implements Comparable<Student>{//override
    String name;
    int rank;
    public Student(String name, int rank){
      this.name= name;
      this.rank= rank;
    }
    @Override
    public int compareTo(Student s){
      return this.rank - s.rank;//we are selecting on the basis of rank so that we compare with rank(let we wants to select a student in any random company)
    }
  }
  public static void main(String[] args) {
    PriorityQueue<Student> pq= new PriorityQueue<>();//here the Object(Student) is taken in place of Primitive data types

    //PriorityQueue<Student> pq1= new PriorityQueue<>(Comparator.reverseOrder());this PL helps to reverse the priority

    pq.add(new Student("A", 87));
    pq.add(new Student("B", 187));
    pq.add(new Student("C", 287));
    pq.add(new Student("D", 487));

    while (!pq.isEmpty()) {
      System.out.println(pq.peek().name +"->"+ pq.peek().rank);
      pq.remove();
    }
  }
}
