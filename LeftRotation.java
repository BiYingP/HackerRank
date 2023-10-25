// Left Roation Array

// Given an array a of n integers and number d, perform d left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

// Example:
// Input: a = [1,2,3,4,5], d = 2
// Output: [3,4,5,1,2]

import java.util.*;
public class LeftRotation{
	public static List<Integer> rotateLeft(List<Integer> a, int d){
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < a.size(); i++){
			if (a.size() == d){
				d = 0;
			}
			res.add(a.get(d++));
		}
		return res;
	}
	public static void main(String[] args){
		
		List<Integer> a = new ArrayList<>();
		for (int i = 1; i < 6; i++){
			a.add(i);
		}
		int d = 2;
		System.out.println(a);
		System.out.println("After Rotation");
		System.out.println(rotateLeft(a, d));
	}	
}
