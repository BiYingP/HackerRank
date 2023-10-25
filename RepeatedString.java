// Repeated String

// Given a string s that is repeated infinitely many times. Given an integer n, find and print the number of letter a's in the infinite string.

// Example:
// Input: s = 'abcac', n = 10
// Output: 4

import java.util.*;
public class RepeatedString{

	public static long repeatedString(String s, long n){
		long numRepeat = n / s.length();
		long remainder = n % s.length();
		long count = 0;

		// count 'a' in the string
		for (int i = 0; i < s.length(); i++){
			if (s.charAt(i) == 'a') count++;
		}
		// update count 'a' in the number of repeat string 
		count = count * numRepeat;
		
		// count 'a' in remainder string	
		for (int i = 0; i < remainder; i++){
			if (s.charAt(i) == 'a') count++;
		}

		return count;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a string to repeat: ");
		String s = scan.nextLine();
		System.out.print("Enter a number of characters: ");
		long n = scan.nextInt();

		System.out.println(repeatedString(s, n));
	}
}
