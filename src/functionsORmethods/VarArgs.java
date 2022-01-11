package functionsORmethods;

public class VarArgs {
    public static void main(String[] args) {
//            fun("Sarah");
            
            multiples(8, 9, "nansana");
    }

    static void multiples(int a, int b, String ...places){
        System.out.println(places);
    }

    static  void fun(String ...names){
        System.out.println(names);
    }
}
