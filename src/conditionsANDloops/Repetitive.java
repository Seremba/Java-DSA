package conditionsANDloops;

public class Repetitive {
    public static void main(String[] args) {
        // how many times is the number repaeting itself?
        int n = 4553656;

        int count = 0;
        while(n > 0){

            int rem = n % 10;
            if(rem == 5){
                   count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
