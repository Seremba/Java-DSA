package binary_search;

public class Main {

	public static void main(String[] args) {
		int arr[] = {-18, -16, -12, 0, 2, 3, 4, 6, 12, 14, 18, 22, 27};
		int target = 6;
		int ans = binarySearch(arr, target);

		System.out.println(ans);

	}
//	return the index
//	return -1 if it is not found

	public  static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length -1;

		while(start <=end){
//			find the middle element
			int mid = start + (end - start) / 2;

			if(target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]){
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	// how to find whether an array is sorted in ascending or descending order
	public static int findOrderOfSort(int[] arr, int target){
		int start = 0;
		int end = arr.length -1;

//		check if the array is sorted in ascending order or in descnending oerder
		boolean isAsc;
		if(arr[start] < arr[end]) {
			isAsc = true; // arr is in ascending order
		} else {
			isAsc = false;
		}

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
