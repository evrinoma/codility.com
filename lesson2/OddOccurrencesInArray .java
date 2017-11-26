import java.util.*;

public class HelloWorld
{
  
  public static void main(String[] args)
  {
    int A[] = {1,2,3,4,5,5,4,3,2,1,42};
    Solution myObject = new Solution();
    System.out.print(myObject.solution(A));
  }
}


class Solution {
    private HashMap<Integer,Integer> unpair = new HashMap<Integer,Integer>();
    
    private Integer unPair = null;
    
    private void search(int[] A) {        
        for (int key=0; key<A.length; key++)
        {
            if(null == unpair.get(A[key])) {
                unpair.put(A[key],key);
            } else {
                unpair.remove(A[key]);
            } 
        }
       unpair.forEach((k,v) -> unPair= k);
    }
    
    public int solution(int[] A) {
        search(A);
        return (null == unPair) ? 0 : unPair;
    }
}
