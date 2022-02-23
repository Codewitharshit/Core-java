package arrayAssignment;

import java.util.Scanner;

//Write a Java program to insert an element (specific position) into an array.

public class InsertAnElement {
     
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the position at which you want to insert element");
		int pos=sc.nextInt();
		System.out.println("Enter the Element you want to store");
		int element =sc.nextInt();
		for(int i=arr.length-1;i>pos-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos-1]=element;
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}
