package arraysANDarraylists;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 5};

//        swap(arr, 0,2);
//        int ans = max(arr);
        reverse(arr);
        int ansRange = maxRange(arr, 1,3);
//        System.out.println(ansRange);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }









    /*
     find the max number in an array
     */
    public static int max(int[] arr){
        int maxvalue = arr[0];
        for (int i =1; i < arr.length; i++){
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;

    }

    /*
    find the max number in a range
     */
    public static int maxRange(int[] arr, int start, int end){
        int maxvalue = arr[start];
        for (int i =start; i <= end; i++){
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;

    }
    /*
    swap numbers from different indices
     */

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
