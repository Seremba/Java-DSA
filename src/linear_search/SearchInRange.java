package linear_search;

public class SearchInRange {

	public static void main(String[] args) {
		int [] arr = {12, 13, 45, -3, 78, 90, 56, 78, 100, 111};
		int target = 79;
		System.out.println(linearSearch(arr, target, 1,7));
	}

	static int linearSearch(int[] arr, int target, int start, int end){

		if(arr.length == 0){
			return -1;
		}
		//        run a for loop
		for (int i = start; i <= end; i++) {

			int element = arr[i];

			if(element == target){
				return i;
			}
		}

		// this will return if nothing is seen in tha array
		return -1;
	}







}
