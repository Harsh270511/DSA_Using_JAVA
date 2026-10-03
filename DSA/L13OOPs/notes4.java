package ApnaCollege.L13OOPs;

public class notes4 {
  public static void main(String[] args) {
    students s = new students();// non- parameterized constructor
    // System.out.println(s.name);

    students s1 = new students("Harsh");// object for calling name & it is a parameterized constructor
    students s2 = new students(12);// object for calling roll no & it is a parameterized constructor

    // Student s3= new Student("harsh" , 23) no such construtor exist in which two
    // paramter is passed hence it will create an error
  }
}

class students {
  String name;
  int rollNo;

  // we can define more then one constructor in single class

  // this is the non- parameterized constructor
  students() {
    System.out.println("Inside the construtor..");
  }

  // this is the parameterized constructor
  students(String name) {
    this.name = name;
  }

  // this is the parameterized constructor
  students(int rollNo) {
    this.rollNo = rollNo;
  }

}
