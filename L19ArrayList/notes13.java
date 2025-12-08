//pair sum 2 using 2 pointer
package L19ArrayList;

import java.util.ArrayList;

public class notes13 {
  public static boolean pairSum2(ArrayList<Integer> list , int target){
    int bp= -1;
    int n= list.size();
    for(int i=0; i< list.size(); i++){
      if(list.get(i) > list.get(i+1)){//breaking point
        bp=i;
        break;
      }
    }
    int lp=bp+1;//smallest element
    int rp= bp; //larget element
    while(lp != rp){
      //case 1
      if(list.get(lp) + list.get(rp) == target){
        return true;
      }if(list.get(lp) + list.get(rp) < target){
        lp = (lp +1)%n;
      }else{
        rp= (n +rp -1)%n;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(11);
    height.add(15);
    height.add(6);
    height.add(8);
    height.add(9);
    height.add(10);

    int target = 16;

    System.out.println(pairSum2(height, target));
  }
}
