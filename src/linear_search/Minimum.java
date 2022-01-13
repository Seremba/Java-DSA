package linear_search;

public class Minimum {

	public static void main(String[] args) {
		int [] arr = {12, 13, 45, -3, 78, 90, 56, 78, 100, 111};
		System.out.println(min(arr));
	}
	// assume the array != 0;
	// print the min number
	public static int min(int[] arr){
		int ans = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
