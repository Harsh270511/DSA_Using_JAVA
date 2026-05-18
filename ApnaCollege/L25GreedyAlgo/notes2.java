//Activity Selection if the given array is unsorted
package ApnaCollege.L25GreedyAlgo;

import java.util.*;

public class notes2 {
  public static void main(String[] args) {
    int start[] = { 1, 3, 0, 5, 8, 5 };
    int end[] = { 2, 4, 6, 7, 9, 9 };

    //sorting the array if not sorted
    int[][] activities = new int[start.length][3];//3 = index, start, end
    for(int i=0; i< start.length; i++){
      activities[i][0]=i;
      activities[i][1] = start[i];
      activities[i][2]= end[i];
    }
    //Lambda function -> shortform
    Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));//sorting on the basis of ending index using lambda function
    // end time basis sorted
    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();

    // 1st actitivity
    maxAct = 1;
    ans.add(activities[0][0]);
    int lastEnd = end[0];
    for (int i = 1; i < end.length; i++) {
      if (start[i] >= lastEnd) {
        // activity selection
        maxAct++;
        ans.add(i);
        lastEnd = end[i];
      }
    }
    System.out.println("Maximum Activity selection would be: " + maxAct);
    for (int i = 0; i < ans.size(); i++) {
      System.out.print("A" + ans.get(i) + " ");

    }
    System.out.println();
  }
}
