// Java program to check if the string 
// contains only special characters 

import java.util.regex.*; 
class GFG { 

	// Function to check if a string 
	// contains only special characters 
	public static void onlySpecialCharacters( 
		String str) 
	{ 

		// Regex to check if a string contains 
		// only special characters 
		String regex = "[^a-zA-Z0-9]+"; 

		// Compile the ReGex 
		Pattern p = Pattern.compile(regex); 

		// If the string is empty 
		// then print No 
		if (str == null) { 
			System.out.println("No"); 
			return; 
		} 

		// Find match between given string 
		// & regular expression 
		Matcher m = p.matcher(str); 

		// Print Yes If the string matches 
		// with the Regex 
		if (m.matches()) 
			System.out.println("Yes"); 
		else
			System.out.println("No"); 
	} 

	// Driver Code 
	public static void main(String args[]) 
	{ 
		// Given string str 
		String str = "@#$&%!~"; 

		// Function Call 
		onlySpecialCharacters(str); 
	} 
}
