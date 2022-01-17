package binary_search;
/*
Find Smallest Letter Greater Than Target

 Given a characters array letters that is sorted in non-decreasing order and a character target,
 return the smallest character in the array that is larger than target.
 */
public class NextGreatestLetter {

	public static void main(String[] args) {
		char[] letters = {'c','f','j'};
		char target = 'a';
	   char ans = (char) nextGreatestLetter(letters, target);

		System.out.println(ans);

	}

	public  static int nextGreatestLetter(char[] letters, int target) {

		int start = 0;
		int end = letters.length -1;

		while(start <=end){
			//			find the middle element
			int mid = start + (end - start) / 2;

			if(target < letters[mid]) {
				end = mid - 1;
			} else{
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
	}





}
