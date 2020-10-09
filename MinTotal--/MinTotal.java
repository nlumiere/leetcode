import java.lang.Math.*;
import java.util.*;

class MinTotal {
   public static void main(String [] args){
      MinTotal mt = new MinTotal();
      List<List<Integer>> tri = new ArrayList<List<Integer>>();
      List<Integer> li = new ArrayList<Integer>();
      li.add(1);
      tri.add(li);
      List<Integer> li2 = new ArrayList<Integer>();
      li2.add(2);
      li2.add(3);
      tri.add(li2);
      System.out.println(mt.minimumTotal(tri));
   }

    public int minimumTotal(List<List<Integer>> triangle) {
       int[] A = new int[triangle.size()+1];
       for(int i=triangle.size()-1;i>=0;i--){
           for(int j=0;j<triangle.get(i).size();j++){
               A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
               for(int x : A){
                  System.out.println(x);
               }
           }
       }
       return A[0];
    }
}