package week04;

public class codingProject {

	public static void main(String[] args) {
	//Question 1: 
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
	System.out.println(ages[ages.length-1] - ages[0]);
	// Printing to the console the value of the last int in ages subtracted by the value of the first int in ages 
	
	int[] ages2 = {3, 5, 7, 17, 21, 24, 30, 54, 85}; 
	// new int array with 9 elements 
	System.out.println(ages2[ages2.length-1] - ages2[0]);
	//printing out the last element subtracted by the first element
	
	
	int sum = 0;
	for (int i = 0; i < ages2.length; i++) {
		sum += ages2[i];
	}
	//for loop to add all the ints in ages2 together in a single variable
	System.out.println(sum / ages2.length);
	//printing out the sum of all ints in ages2 divided by the length of ages2 to find the average
	
	//Question 2:
	String[] names = new String[6];
	//declared a new String Array with 6 elements
	names[0] = "Sam";
	names[1] = "Tommy";
	names[2] = "Tim";
	names[3] = "Sally";
	names[4] = "Buck";
	names[5] = "Bob";
	//filling the array
	sum = 0;
	for (int i = 0; i < names.length; i++) {
		sum += names[i].length();
	}
	//for loop adding the length of each word in the array together in an int
	System.out.println(sum / names.length);
	//calculating the average by diving the total letters in the array by the number of elements in the array 
	
	String newName = "";
	for(int i = 0; i < names.length; i++){
		newName += names[i] + " ";
		//used a for loop to add the names together in one variable called newName
	}
	System.out.println(newName);
	//printing the names that were concatenated together 
	
	//Question 3:
	//you can access the last element in an array as such: names[names.lengh-1] ".length" is the property of the names array
	//the ".length" property is how many elements are in the array you subtract one because arrays start at zero 

	//Question 4:
	//you access the first element in an array as such: names[0] the first element in an array is always in the "0" position
	
	//Question 5:
	int[] namesLength = new int[6];
	for (int i = 0; i < namesLength.length; i++) {
		namesLength[i] = names[i].length();
		
	}
	//Question 6:
	sum = 0;
	for(int i = 0; i < namesLength.length; i++) {
		sum += namesLength[i];
	}
	System.out.println(sum);
	
	// Start of Testing Each Method
	
	// 7A
	
	String n = "Word";
	int num = 3;
	
	System.out.println(repeatWord(n, num));
	
	//Printing the method of String n concatenated on itself num times.
	
	//8A 
	String firstName = "Jon";
	String lastName = "Jones";
	
	System.out.println(fullName(firstName, lastName));
	//Printing the method full name with firstName concatenated on lastName
	
	//9A
	
	System.out.println(isArrayOver100(namesLength));
	//Printing out the Method to the console. The method returns false as the numbers in namesLength are not greater than 100. 
	
	//10A
	
	double[] nums = {1.23, 12.5, 15.23, 33,0};
	System.out.println(findingAverage(nums));
	//Printing out the method that finds the average of all the doubles in the num Array. 
	
	//11A
	
	double[] nums2 = {10.55, 20.3, 15.54, 22.45, 17.43};
	
	System.out.println(isOneGreater(nums, nums2));
	//Printing the method that shows that nums is less than num2 as false is printed to the console
	
	//12A
	boolean isHotOutside = true;
	double moneyInPocket = 12.50;
	
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	//The Method returns true because isHotOutdie is true and moneyInPocket is greater than 10.50
	
	//13A
	double powerBill = 200.00;
	System.out.println(willITurnOnAC(isHotOutside, powerBill));
	//The Method returns false because while isHotOutside is true powerBill is also over 150.00
	
	 
	
	}

//Question 7:
static String repeatWord(String word, int n) {
	String result = "";
	for(int i = 0; i < n; i++) {
		result += word; 
	}
	return result; 
}
//Question 8:
static String fullName (String firstName, String lastName) {
	String fullName = firstName + " " + lastName;
	return fullName;
}
//Question 9:
static boolean isArrayOver100 (int[] num) {
	int sum = 0;
	for(int i = 0; i < num.length; i++) {
		sum += num[i];
	}
	if (sum > 100) {
		return true;
	}else {
		return false;
	}
	
}
//Question 10:
static double findingAverage (double[] nums) {
	double sum = 0;
	for (int i = 0; i < nums.length; i++) {
		sum += nums[i];
	}
	double average = sum / nums.length;
	return average;
}
//Question 11:
static boolean isOneGreater (double[] arr1, double[] arr2) {
	double sum1 = 0;
	double sum2 = 0;
	for(int i = 0; i < arr1.length; i++) {
		sum1 += arr1[i];
	}
	double average1 = sum1 / arr1.length;
	for(int j = 0; j < arr2.length; j++) {
		sum2 += arr2[j];
	}
	double average2 = sum2 / arr2.length;
	if (average1 > average2) {
		return true;
}else {
	return false;
}
}
//Question 12:
static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	if (isHotOutside == true && moneyInPocket > 10.50) {
		return true;
	}else {
		return false;
	}
}
//Question 13:
static boolean willITurnOnAC(boolean isHotOutside, double powerBill) {
	if (isHotOutside == true && powerBill < 150.00) {
		return true;
	}else {
		return false; 
	}
	//this is a boolean method to tell me if it is hot outside and the current power bill is less than $150.00 I will turn on the AC
	//if either statement is false then I will not turn on the AC
}

}
