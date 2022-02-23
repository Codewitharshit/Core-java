package arrayAssignment;

//Write a Java program to find the maximum and minimum value of an array

public class MaxAndMin {

	public static void main(String[] args) {
		int arr[] = { -1, 2, 7, 6, 9 };
		int maximum = arr[0];
		int minimum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (maximum < arr[i]) {
				maximum = arr[i];
			} else if (minimum > arr[i]) {
				minimum = arr[i];
			}
		}
		System.out.println("Maximum value is" + maximum);
		System.out.println("Minimum value is" + minimum);
	}
 
}
