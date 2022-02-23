package arrayDeclaration;

import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// int arr[]=new int[100];

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter");
		int size =sc.nextInt();
		int marks[]=new int[size];
		System.out.println("Enter input");
		for(int i=0;i<size;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(marks[i]);
		}
		 }

	}

