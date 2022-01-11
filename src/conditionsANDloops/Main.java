package conditionsANDloops;

public class Main {
    public static void main(String[] args) {
        /*
        syntax for if statement
        if(boolean expression true or false) {
           body
         } else {
          body
         }
         */
        int salary = 15000;
        if(salary > 20000){
            salary = salary + 2000;
        } else if( salary > 35000){
            salary = salary + 3000;
        } else {

            salary += 1000;
        }

        System.out.println(salary);
    }
}
