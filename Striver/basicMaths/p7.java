//Print all divisor Optimal solution
package Striver.basicMaths;

import java.util.*;

public class p7{
  public static List<Integer> divisor(int n){
    List<Integer> ls= new ArrayList<>();

    for(int i=1; i*i <=n; i++){
      if(n %i==0){
        ls.add(i);

        if(i !=n/i){
          ls.add(n/i);
        }
      }
    }
    Collections.sort(ls);
    for(int num: ls){
      System.out.print( num+" ");
    }
    return ls;
  }
    public static void main(String[] args) {
      int n=36;
      divisor(n);
    }
}