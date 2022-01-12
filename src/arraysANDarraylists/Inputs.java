package arraysANDarraylists;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Array of primitives
        int[] arr = new int[5];

        System.out.println("Input array values");
        for (int i=0; i < arr.length; i++){

            arr[i] = Integer.parseInt(in.next());
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        for (int el : arr) { //for every element in an array, print that element
            System.out.println(el);
        }


    }
}
