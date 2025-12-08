//finding the last occurences
package L14_15Recursion;

public class notes8 {
  public static int lastOcc(int[] arr, int key, int i){
    if(i == arr.length){
      return -1;
    }
    int isFound =lastOcc(arr, key, i+1);
    if(isFound == -1 && arr[i] == key){
      return i;
    }
    
    return isFound;
  }
  public static void main(String[] args) {
    int[] arr= {1,2,4,7,8,5,3,2,};
    int key =8;
    System.out.println(lastOcc(arr, key, 0));
  }
}
