package linear_search;

public class EvenDigits {

	public static void main(String[] args) {
      int[] nums = {12, 345, 2, 6, 7896};
		System.out.println(findNumbers(nums));
	}
	/*
	Given an array of integers, return how many of them contain an even number of digits.
	 */
	static int findNumbers(int[] nums){
		int count = 0;
		for(int num : nums){
			if(even(num)){
				count++;
			}
		}
		return count;
	}

	// function to check whether the number contains even number of digits
	 static boolean even(int num) {
		int numberOfDigits = digits(num);
		if(numberOfDigits % 2 ==0){
			return true;
		}
		return false;
	}

	// count number of digits in a number- shortcut
	static int digits2(int num){
		return (int)(Math.log10(num)) + 1;
	}


	// count number of digits in a number
	static int digits(int num){
		int count = 0;
		while(num > 0){
			count++;
			num = num /10;
		}

		return count;
	}
}
