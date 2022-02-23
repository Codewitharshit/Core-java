package arrayAssignment;

import java.util.Scanner;

//Write a Java program to test if an array contains a specific value.

public class SpecificValue {

	public static void main(String[] args) {
		int arr[]= {10,-1,4,5,2,1};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a key");
		int key = sc.nextInt();
        boolean flag =false;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==key) {
        		flag=true;
        	}
        }
        if(flag==true) {
        	System.out.println("key is present");
        }
        else {
        	System.out.println("Key is not present");
        }
	}

}
