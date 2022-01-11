package conditionsANDloops;

public class Reverse {
    public static void main(String[] args) {
        // reverse a number say 3456 to 6543
        int num = 34567;

        int ans = 0;
        while(num > 0) {
            int rem = num % 10;
            num = num / 10;
            ans = (ans * 10 ) + rem;

        }
        System.out.println(ans);

    }
}
