//container  with most water better  approach using 2 pointer approach
//Rp = Right pointer
//LP = Left pointer
package L19ArrayList;

import java.util.ArrayList;

public class notes10 {
  public static int mostWater(ArrayList<Integer> height){
    int maxWater=0;
    int LP = 0;
    int RP = height.size()-1;
    while(LP < RP){
      int ht= Math.min(height.get(LP), height.get(RP));
      int width = RP- LP;
      int currWater = ht * width;
      if(height.get(LP) < height.get(RP)){
        LP++;
      }else{
        RP--;
      }
      maxWater = Math.max(maxWater, currWater);
    }
    return maxWater;
  }
  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();

    height.add(1); height.add(8); height.add(6); height.add(2); height.add(5); height.add(4);height.add(8);height.add(3); height.add(7);

    System.out.println(mostWater(height));

  }
  
}
