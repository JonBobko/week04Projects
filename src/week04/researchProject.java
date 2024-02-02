package week04;

import java.util.Arrays;

public class researchProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Research Project 
		
		// First Prompt String Methods
		
		String str = "Hello!";
		
		//1a) 
		//First String Method .charAt()
		System.out.println(str.charAt(3));
		/*this method finds the character at a specified index in a string. 
		 *you can also use the charAt method to run through a string and search for specified chars.
		 *
		 *
		 * 
		 * 
		 */
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'l'){
				counter++;
			}
			System.out.println(counter);
		}
		/*This loop shows how using the charAt method you can run through a string and find a specific char.
		 *It is also important to remember like arrays the first index in the length of a string is '0'.
		 **This is just one of the many uses of the charAt method. 
	    */
		
		
		/*1b) 
		 * Next, we have the .length() method.
		 * This method is used to find the number of character (chars) in a String. 
		 * As show above this method could be used in a for loop to run as many iterations of the loop
		 * as there are chars in a String. 
		 */
		System.out.println(str.length());
		/* This shows that the length of String str is 6 chars. 
		 */
		
		/*1c) 
		 * concat method. 
		 * The concat method merges multiple strings together.
		 * 
		 */
		System.out.println(str.concat(str));
		/*The above code demonstrates how the concat method adds multiple strings together. 
		 * One real word example are the demographic forms we so often fill out on websites.
		 * Here is an example of how that might look.
		 */
		String firstName = "Jonathan";
		String lastName = "Bobko";
		System.out.println(firstName.concat(" " + lastName));
		
		
		/*1d) 
		 * Strip method 
		 * The strip method removes any spaces from the beginning or end of a string. 
		 * This is useful when gathering data from a user such as a username and password 
		 * a user may add unnecessary spaces to the beginning or end of their username or password.
		 * Here is an example of what that might look like.
		 */
		String userName = " JonBob ";
		String passWord = " password ";
		
		// When we use the strip method we remove those extra spaces. 
		
		String cleanUserName = userName.strip();
		String cleanPassWord = passWord.strip();
		
		System.out.println(cleanUserName);
		System.out.println(cleanPassWord);
		
		/*1e) 
		 * toLowerCase/toUpperCase methods
		 * The toLowerCase and toUpperCase methods change all chars in a String to either upper or lower case.
		 * This is useful when taking user data and putting it all into the same case to avoid errors.
		 * Below is an example of this.  
		 */
		userName = "JoNaTHAN";
		System.out.println(userName.toLowerCase());
		//This is how the toLowerCase method may be used to clean up user data. 
		
		
		
		/*String Methods Sources:
		 * https://www.crio.do/blog/string-methods-in-java/
		 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html
		 * https://www.w3schools.com/java/ref_string_tolowercase.asp
		 * 
		 */
		
		// Second Prompt Arrays
		
		/* 2a)
		 * Sort Method
		 * The sort method sorts an Array in ascending order ie. smallest to largest. 
		 * This is useful when making an array of ints such as looking at a set of ages.
		 * You can add the ages in any order and then sort them later.
		 */
		
		int[] ages = {12, 7, 18, 21, 22, 34, 45, 50};
		Arrays.sort(ages);
		//The array is now sorted. 
		System.out.println(Arrays.toString(ages));
		
		/*2b) 
		 * toString method
		 * The toString method is useful for converting arrays into Strings. 
		 * One common example is changing an array of char into a string. 
		 * This can also be used in converting any type of array into a string such as an array of ints. 
		 * This method can also be used to print an Array without having to use a for loop. 
		 */
		char[] x = {'h', 'e', 'l', 'l', 'o', '!'};
		Arrays.toString(x);
		//This method changes the array of char into a string. 
		System.out.println(x);
		
		/*2c) 
		 * binarySearch Method 
		 * This method searches a given array for a specific value. 
		 * If that value is present the method will return the index at which that value is found.
		 * Otherwise the method will return a negative value. 
		 * 
		 * 
		 */
		System.out.println(Arrays.binarySearch(ages, 7));
		// The method returns 0 because the value 7 is found at the first index in the array.
		System.out.println(Arrays.binarySearch(ages, 9));
		// The method returns -2 as the value 9 is not found in the array ages.
		
		/*2d) 
		 * fill Method
		 * The fill method is used to quickly fill an array with a single value. 
		 * This can be done with either the entire array or a range within the array. 
		 * 
		 */
		String[] names = {"Tom", "James", "Will", "Ben", "Tim"};
		System.out.println(Arrays.toString(names));
		Arrays.fill(names, "Jon");
		System.out.println(Arrays.toString(names));
		//This is an example of filling the entire array with a new string
		Arrays.fill(names, 0, 4, "James");
		System.out.println(Arrays.toString(names));
		//This is an example of filling the array between a start and end point with a new string
		
		/*2e)
		 * Clone Method
		 * This method clones an array into another array. They will have the exact same values 
		 * but now we can make changes to the second array without changing the first array. 
		 * 
		 */
		
		
		String[] names2 = names.clone();
		
		System.out.println(Arrays.toString(names2));
		
		names2[0] = "Tim";
		names2[1] = "Nick";
		names2[2] = "Jesse";
		
		System.out.println(Arrays.toString(names));
		// This is the original array.
		System.out.println(Arrays.toString(names2));
		// This is the new Array that was changed. 
		
		/*Sources 
		 * https://www.codecademy.com/resources/docs/java/arrays/fill
		 * https://medium.com/@fullstacktips/java-arrays-class-most-used-methods-with-code-examples-999b928de7a9
		 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/reflect/Array.html
		 * 
		 * 
		 */
		
		
		
		
	}

}
