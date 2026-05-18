//Count Distint element
package ApnaCollege.L21LinkedList2.L32Hashing;
import java.util.HashSet;
public class notes11 {
  public static void main(String[] args) {
    int[] arr= {4,3,2,5,6,7,3,4,2,1};
    HashSet<Integer> set= new HashSet<>();

    for(int i =0; i< arr.length; i++){
      set.add(arr[i]);
    }
    System.out.println("Count of distint element is: "+ set.size());
  }
}
