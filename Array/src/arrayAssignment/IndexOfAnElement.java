package arrayAssignment;

import java.util.Scanner;

//Write a Java program to find the index of an array element

public class IndexOfAnElement {

	public static void main(String[] args) {
		int arr[] = { 10, 1, 5, 11, 5, 6 };
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		System.out.println("Enter a key");
		int key = sc.nextInt();
		int i;
		int index = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				flag = true;
				index = i;
			}

		}
		if (flag == true) {
			System.out.println("index of key is" + index);

		} else {
			System.out.println("key is not present");
		}

	}
}
