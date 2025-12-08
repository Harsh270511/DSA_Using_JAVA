//How to declare array list
package L19ArrayList;

import java.util.ArrayList;

public class notes1 {
  public static void main(String[] args) {
    // syntax: Class name<Data type but object format> Obj name= new className<>();
    ArrayList<Integer> l1 = new ArrayList<>();
    ArrayList<String> l2 = new ArrayList<>();
    ArrayList<Boolean> l3 = new ArrayList<>();

    // Add element using .add() function
    l1.add(1);
    l1.add(4);
    l1.add(6);
    l1.add(9);
    System.out.println(l1);

    l1.add(1,11111);
    System.out.println(l1);//1st index pr 11111 add ho jayga
    // Get element using .get(index) fxn
    System.out.println(l1.get(3));
    l2.add("HARSH");
    l2.add("Maurya");
    l2.add("Yash");
    l2.add("Mummy jii");
    System.out.println(l2.getClass());

    // removing the element
    l1.remove(1);
    System.out.println(l1);// index 1 ki element from l1 ab remove ho chuki h

    // set the elemet(index, newValue at that index)
    l1.set(1, 1000);
    System.out.println(l1);

    // contains elements
    System.out.println(l1.contains(12));//l1 vale object me 12 nhi hai hence return true
    System.out.println(l1.contains(1000));//l1 vale object me 1000 hai hence return true

  }
}
