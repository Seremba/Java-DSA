import java.util.Scanner;

public class HelloLinux {
    public static void main(String[] args){
//        System.out.println("Hello Nankya");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int schoolNum = scanner.nextInt();

        System.out.println("This is school has a population of "+schoolNum+ " students");
    }
}

