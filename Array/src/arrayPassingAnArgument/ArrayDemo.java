package arrayPassingAnArgument;

import java.util.Scanner;

public class ArrayDemo {
	static void passingArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int score[] = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			score[i] = sc.nextInt();
		}
		passingArray(score);// function call

	}

}
