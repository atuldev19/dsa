# A simple Python 3 program to group multiple occurrences of individual array elements 

def groupElements(arr, n): 

	# Initialize all elements 
	# as not visited 
	visited = [False] * n 
	for i in range(0, n): 
		visited[i] = False

	# Traverse all elements 
	for i in range(0, n): 
	
		# Check if this is 
		# first occurrence 
		if (visited[i] == False): 
		
			# If yes, print it and 
			# all subsequent occurrences 
			print(arr[i], end = " ") 
			for j in range(i + 1, n): 
			
				if (arr[i] == arr[j]): 
				
					print(arr[i], end = " ") 
					visited[j] = True
			
# Driver Code 
arr = [4, 6, 9, 2, 3, 
	4, 9, 6, 10, 4] 
n = len(arr) 
groupElements(arr, n) 

# This code is contributed 
# by Smitha 
