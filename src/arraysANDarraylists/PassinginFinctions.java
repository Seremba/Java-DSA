package arraysANDarraylists;

import java.util.Arrays;

public class PassinginFinctions {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 60};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void change(int[] arr) {
        arr[0] = 99;
    }
}
