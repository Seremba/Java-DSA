package binary_search;

import java.util.Arrays;

/*
  Find First and Last Position of Element in Sorted Array
  Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchRange {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		int[] ans = searchRange(nums,target);
		System.out.println(Arrays.toString(ans));
	}
	 static int[] searchRange(int[] nums, int target) {

		int[] ans = {-1, -1};
//		check for first occurence
        int start = search(nums, target, true);
		int end = search(nums, target, false);

		ans[0] = start;
		ans[1] = end;

		return ans;

	}

	// this function returns the index value of target
	static int search(int[] nums, int target, boolean findStartIndex){
		int potentialAnswer = -1;
		int start = 0;
		int end = nums.length -1;

		while(start <=end){
			//	find the middle element
			int mid = start + (end - start) / 2;

			if(target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]){
				start = mid + 1;
			} else {
				//	potential ans found
				potentialAnswer = mid;
				if(findStartIndex){
					end = mid -1;
				} else {
					start = mid + 1;
				}
			}
		}
		return potentialAnswer;
	}







}
