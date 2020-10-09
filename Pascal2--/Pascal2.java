import java.util.*;

class Pascal2 {
   public static void main(String[] args){
      Pascal2 p = new Pascal2();
      System.out.println(p.getRow(3));
   }

    public List<Integer> getRow(int rowIndex) {
        if(rowIndex <= 0){
            List<Integer> zero = new ArrayList<Integer>();
            return zero;
        }
        
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        List<Integer> base = new ArrayList<Integer>();
        base.add(1);
        tri.add(base);
        
        for(int ii = 1; ii < rowIndex+1; ii++){
            List<Integer> li = new ArrayList<Integer>();
            li.add(1);
            for(int jj = 1; jj < ii; jj++){
                int a = (tri.get(ii-1)).get(jj-1);
                int b = (tri.get(ii-1)).get(jj);
                li.add(a+b);
            }
            li.add(1);
            tri.add(li);
        }
        
        return tri.get(rowIndex);
    }
}