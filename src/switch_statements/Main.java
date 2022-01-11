package switch_statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String fruit = in.next();
        switch (fruit) {
            case "Mango":
                System.out.println("Most ppular fruit");
                break;
            case "Apple":
                System.out.println("Most sweet fruit");
                break;
            case "Pears":
                System.out.println("Kinda similar to mango");
                break;
            case "mpafu":
                System.out.println("Very tiny fruit");
                break;
            default:
                System.out.println("enter valid fruid");
                break;
        }
    }
}
