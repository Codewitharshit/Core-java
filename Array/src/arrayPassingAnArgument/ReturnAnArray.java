package arrayPassingAnArgument;

import java.util.Arrays;

public class ReturnAnArray {
  public static String[] arr() {
	  String[]array= {"Harshit","Rohit","Ankush"};
	  return array;
  }
	public static void main(String[] args) {
		String [] str_arr=arr();
		System.out.println(Arrays.toString(str_arr));
      
	}

}
