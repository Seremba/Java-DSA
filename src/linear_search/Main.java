package linear_search;

public class Main {
    public static void main(String[] args) {
        int [] arr = {12, 13, 45, -3, 78, 90, 56, 78, 100, 111};
        int target = 45;
       int ans = linearSearch(arr, target);
        System.out.println(ans);

    }
    /*
    search for the element in the array. If found return element if not return -1
     */

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }
//        run a for loop
        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];

            if(element == target){
                return i;
            }
        }

        // this will return if nothing is seen in tha array
        return -1;
    }














}


