// A simple Java program to group 
// multiple occurrences of individual 
// array elements 

class GFG 
{ 

	// A simple method to group all occurrences 
	// of individual elements 
	static void groupElements(int arr[], int n) 
	{ 
		
		// Initialize all elements as not visited 
		boolean visited[] = new boolean[n]; 
		for (int i = 0; i < n; i++) 
		{ 
			visited[i] = false; 
		} 

		// Traverse all elements 
		for (int i = 0; i < n; i++) 
		{ 
			
			// Check if this is first occurrence 
			if (!visited[i]) 
			{ 
				
				// If yes, print it and all 
				// subsequent occurrences 
				System.out.print(arr[i] + " "); 
				for (int j = i + 1; j < n; j++) 
				{ 
					if (arr[i] == arr[j]) 
					{ 
						System.out.print(arr[i] + " "); 
						visited[j] = true; 
					} 
				} 
			} 
		} 
	} 

	/* Driver code */
	public static void main(String[] args) 
	{ 
		int arr[] = {4, 6, 9, 2, 3, 4, 
						9, 6, 10, 4}; 
		int n = arr.length; 
		groupElements(arr, n); 
	} 
} 

