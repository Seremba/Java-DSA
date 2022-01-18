package binary_search;
 /*
  https://leetcode.com/problems/peak-index-in-a-mountain-array/
  */
public class mountainArray {

	public static void main(String[] args) {

	}

	 public int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length -1;

		while(start < end) {

			int mid = start + (end - start) / 2;
			if(arr[mid] < arr[mid + 1]) {
				/*
				You are in the decreasing part of the array, this might be the answer but look at left
				this is why mid != mid - 1
				 */

				end = mid;
			} else {
				// you are in the ascending order of the array
				start = mid + 1; // because we know that mid + 1 < middle element
			}
		}
/*
    In the end, start = end, pointing to the largest number coz of the two checks above, Start and end are always trying
    to find max element in the above two checks, hence when they are pointing to one max element that is the max
    because that is what the checks say
 */
		 return start;
	 }
}
