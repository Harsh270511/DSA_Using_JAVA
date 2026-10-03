//weakest soldier
package ApnaCollege.L31Heaps;
import java.util.*;
public class notes10 {
  //Binary Matrix  (m X n)
  static class Row implements Comparable<Row> {
    int soldiers;
    int idx;
    public Row(int soldiers, int idx){
      this.soldiers=soldiers;
      this.idx= idx;
    }
    @Override
    public int compareTo(Row a1){
      //agr number of soldiers equal hye to index compare kro jiska index jyda vo strong hoga
      if(this.soldiers==a1.soldiers){
        return this.idx - a1.idx;
      }
      //agr soldiers equal nhi huye to jishme jyda soldiers vo most strong honge
      else{
        return this.soldiers - a1.soldiers;
      }
    }
  }
  public static void main(String[] args) {
    int[][] army = {{1,0,0,0},
                    {1,1,1,1},
                    {1,0,0,0},
                    {1,0,0,0}};
    int k=2;

    PriorityQueue<Row> pq = new PriorityQueue<>();
    for(int i=0; i < army.length;i++){
      int count=0;
      for(int j=0; j < army[0].length; j++){
        count+= army[i][j]==1 ? 1:0;
      }
      pq.add(new Row(count, i));
    }
    //printing rows
    for(int i=0; i < k ; i++){
      System.out.println("R"+ pq.remove().idx);
    }
  }
}
