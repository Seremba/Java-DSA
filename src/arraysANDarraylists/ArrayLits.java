package arraysANDarraylists;

import java.util.ArrayList;

public class ArrayLits {
    public static void main(String[] args) {
        // syntax of Array list

        ArrayList<Integer> arr = new ArrayList();

        arr.add(6);
        arr.add(7);
        arr.add(78);
        arr.add(786);
        arr.add(785);
        arr.add(879);

        arr.set(3, 44);
        arr.remove(1);
        System.out.println(arr);
    }
}
