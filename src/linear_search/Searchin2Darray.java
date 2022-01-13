package linear_search;

import java.util.Arrays;

public class Searchin2Darray {

	public static void main(String[] args) {
        int arr[][] = {
		        {23, 4, 1},
		        {18, 12, 3, 9},
		        {78, 99, 34, 76},
		        {18, 12}
        };
		int target = 99;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] search(int[][] arr, int target){
		for (int row = 0; row < arr.length; row++) {
			for (int col=0; col < arr[row].length; col++){
				if(arr[row][col] == target){
					return new int[] { row, col };
				}
			}
		}
		return new int[] { -1, -1 };
	}
   /*
   finding the max value in a 2D array
    */
	static int max(int[][] arr){
		int maxVal = Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int col=0; col < arr[row].length; col++){
				if(arr[row][col] > maxVal){
					maxVal = arr[row][col];
				}
			}
		}
		return maxVal;
	}

}
