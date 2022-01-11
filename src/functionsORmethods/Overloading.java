package functionsORmethods;

public class Overloading {
    public static void main(String[] args) {
        load(8);
        load( "I can be better");
    }

    static void load(int yes){
        System.out.println(yes);
    }
    static void load(String can){
        System.out.println(can);
    }
}
