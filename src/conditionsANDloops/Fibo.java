package conditionsANDloops;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;

        int count = 0;
        while(count <= n) {
           int temp = a;
           a = a +b;
           b = temp;
           count++;
        }
        System.out.println(b);



    }
}
