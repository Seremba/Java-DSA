package linear_search;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Seremba";
        char target = 'e';
        System.out.println(searchChar(str, target));

    }

    /*
    Using a for each
     */
    public static boolean searchChar2(String str, char target){
        if(str.length() == 0){
            return false;
        }
//        run a for each loop
        for ( char ch : str.toCharArray()){
            if(ch == target) {
                return true;
            }
        }
        return false;
    }
    /*
    Using a for loop
     */
    public static boolean searchChar(String str, char target){
        if(str.length() == 0){
            return false;
        }
//        run a for loop
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
