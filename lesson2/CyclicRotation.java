//*******************************************************************
import java.util.*;

public class HelloWorld
{
  
  public static void main(String[] args)
  {
    int A[] = {1,1,2,3,5};
    //int A[] = null;
    int B[];
    int K = 42;
    Solution myObject = new Solution();  
    myObject.print(A);
    myObject.print(myObject.solution(A,K));   
  }
}


class Solution {
    
  	public void print(int[] A)
    {
      if ((null != A) & (0 == A.length)) {
       	System.out.print('[');
   		for (int i=0; i<A.length;i++){
      		System.out.print(A[i]);
          	System.out.print(",");
    	}
    	System.out.println(']');
      }
    }
  
  	private int[] shiftLeft(int[] A, int K) { 
      /**
      	[3,8,9,7,6]	8,9,7,6   3
		[8,9,7,6,3]
		[9,7,6,3,8]
		[7,6,3,8,9]
		[6,3,8,9,7]
      */
    	    int[] tmp = new int[A.length];
            K = normalize(A.length,K);
    		System.arraycopy(A, K, tmp, 0, A.length-K);
    		System.arraycopy(A, 0, tmp, A.length-K, K);
    	return tmp;
    }
  
   	private int[] shiftRight(int[] A, int K) {
      /**
      	[3,8,9,7,6]	6	3,8,9,7
		[6,3,8,9,7]
		[7,6,3,8,9]
		[9,7,6,3,8]
		[8,9,7,6,3]
      */
      	    int[] tmp = new int[A.length]; 
            K = normalize(A.length,K);   		
    		System.arraycopy(A, A.length-K, tmp, 0, K);
      		System.arraycopy(A, 0, tmp, K, A.length-K);
    	return tmp;
    }
  
    private int normalize(int length, int K) {
        return  K%length;
    }

    public int[] solution(int[] A, int K) {
         return ((null != A) & (1 >= A.length)) ? A: shiftRight(A,K);
    }
}
  
  
