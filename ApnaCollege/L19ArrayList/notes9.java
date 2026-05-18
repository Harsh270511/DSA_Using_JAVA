//container  with most water Brute force approach
package ApnaCollege.L19ArrayList;

import java.util.ArrayList;

public class notes9 {
  public static int mostWater(ArrayList<Integer> height){
    int maxWater = 0;
    for(int i=0 ; i< height.size(); i++){
      for(int j=0; j< height.size(); j++){
        int hygt= Math.min(height.get(i), height.get(j));
        int width = j-i;
        int CurrWater = hygt * width;
        maxWater = Math.max(maxWater, CurrWater);
      }
    }
    
    return maxWater;
  }
  public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();

    height.add(1); height.add(8); height.add(6); height.add(2); height.add(5); height.add(4);height.add(8);height.add(3); height.add(7);

    System.out.println(mostWater(height));

  }
}
