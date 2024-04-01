package corejavaexamples;

public class SmallestValue {

	public static void main(String[] args) {
		
		 int A[] = {1,34,5,65,22,-4,-10,0}; 
	        int n = A.length; 
	          
	        
	        System.out.println(findingMin(A, n)); 

	}
	 // function to return minimum element using recursion 
    public static int findingMin(int A[], int n) 
    { 
     
      if(n == 1) 
        return A[0]; 
          
        return Math.min(A[n-1], findingMin(A, n-1)); 
    } 

}
