package leetcode;

import java.util.Arrays;

/**
 *  Given an array of integers, every element appears twice except for one. Find that single one.
 *
 *  Note:
 *  Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * @author db_boy
*/
/*
136	Single Number
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    Note:

    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

    Example 1:

    Input: [2,2,1]
    Output: 1
    Example 2:

    Input: [4,1,2,1,2]
    Output: 4
 */
public class SingleNumber_136 {

	public static void main(String[] args) {
		int[] nums = {5,5,7,8,9,8,7,9,1,1,2,3,3,4,4,2,10};
		System.out.println(singleNumber2(nums));
	}
	
	public static int singleNumber(int[] nums) {
		Arrays.sort(nums); 
		for(int i=0;i<nums.length-1;i=i+2)
		{
			if(nums[i]!=nums[i+1]){
				return nums[i];
			}
		}
        return nums[nums.length-1];
    }
	
	
	public static int singleNumber2(int[] nums) {
		for(int i =0;i<nums.length-1;i++){
			nums[i+1]^=nums[i];
		}
		return nums[nums.length-1];
    }

}
