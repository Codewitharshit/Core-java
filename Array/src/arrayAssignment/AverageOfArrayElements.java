package arrayAssignment;

//Write a Java program to calculate the average value of array elements

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		float sum = 0;

		int size = sc.nextInt();
		int marks[] = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			marks[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			sum = sum + marks[i];
		}
		System.out.println("Average value is");
		float avg = sum / size;
		System.out.println(avg);

	}

}
