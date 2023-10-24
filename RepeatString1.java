// Repeat String number of Times

// Repeat A given string number times. Return an emplty string if number is not a positive number.

// Example
// Input: str = 'abc', num = 2
// Output: 'abcabc'

import java.util.*;
public class RepeatString1{
	public static String repeatString(String str, int num){
		String repeated = "";

		while (num > 0){
			repeated += str;
			num--;
		}
		return repeated;
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a string to be repeated: ");
		String str = s.nextLine();
		System.out.print("Enter a number of time to repeat: ");
		int num = s.nextInt();
		System.out.println(repeatString(str, num));	
	}
}
