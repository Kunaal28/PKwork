package corejavaexamples;

public class SmallestIndexNum {

	
	static int getIndex(int arr[], int n, int K) 
    {        
        for (int i = 0; i < n; i++) { 
            // To store the sum of the series 
            int sum = 0; 
            int den = 1; 
            // Finding  the sum of the series 
            for (int j = i; j < n; j++) { 
                sum += (arr[j] / den); 
                den++; 
                if (sum > K) 
                    break; 
            }           
            if (sum <= K) 
                return i; 
        }   
        return -1; 
    } 
	
	public static void main(String[] args) {
		
		int arr[] = { 2,-3,45,8,-5,11 }; 
        int n = arr.length; 
        int K = 8; 
        System.out.print(getIndex(arr, n, K)); 
			
		}

}
