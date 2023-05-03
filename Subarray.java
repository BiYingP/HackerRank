// Given an array of n intergers, find and print its number of negative subarrays on a new line.

import java.util.*;

public class Subarray{
	public static int solution(int[] nums){
		int count = 0;
		for (int i = 0; i < nums.length; i++){
			int sum = 0;
			for (int j = i; j < nums.length; j++){
				sum += nums[j];
				if (sum < 0) count++;
			}
			
		}
		return count;
	}
	public static void main (String[] args){
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] nums = new int[num];

//		for (int i = 0; i < num; i++){
//			nums[i] = sc.nextInt();
//		}
		int[] nums = {1,-2,4,-5,1};
		System.out.println(solution(nums));
		
	}
}
