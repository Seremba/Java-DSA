package binary_search;
 /*
  https://leetcode.com/problems/find-in-mountain-array/
  */
public class SearchInMountain {

	public static void main(String[] args) {

	}

	int search(int[] arr, int target) {
       int peak = peakIndexInMountainArray(arr);
	   int firstTry = findOrderOfSort(arr,target, 0, peak);
	   if(firstTry != -1){
		   return firstTry;
	   }
//	   try to search in second half
		return findOrderOfSort(arr,target,peak + 1, arr.length-1);

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


	 public static int findOrderOfSort(int[] arr, int target, int start, int end){

		 //		check if the array is sorted in ascending order or in descnending oerder
		 boolean isAsc;
		 isAsc = arr[start] < arr[end]; // arr is in ascending order

		 while(start <=end){
			 // find the middle element
			 int mid = start + (end - start) / 2;

			 if(arr[mid] == target) {
				 return mid;
			 }
			 if(isAsc) {
				 if(target < arr[mid]) {
					 end = mid - 1;
				 } {
					 start = mid + 1;
				 }

			 } else {
				 if(target > arr[mid]) {
					 end = mid - 1;
				 } else{
					 start = mid + 1;
				 }
			 }
		 }
		 return -1;
	 }
}
