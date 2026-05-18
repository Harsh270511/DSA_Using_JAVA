//Linear search
package ApnaCollege.L7Array1;

public class notes14 {
  public static int linerSearch(int[] num, int key){
    for(int i =0; i< num.length; i++){
      if(num[i]==key){
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] num = {1,2,3,4,5,6,7,8,8,5,3,2,1,3,56,7,65,4,2,35,4};
    int key= 325;
    int idx= linerSearch(num, key);
    if(idx == -1){
      System.out.println("Key not found");
    }else{
      System.out.println("Key found");
    }
  }
}
