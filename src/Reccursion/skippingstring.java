package Reccursion;

public class skippingstring {

    static String skipapple(String a){
        if (a.isEmpty()){
            return "";
        }

        if (a.startsWith("apple")){
            return skipapple(a.substring(5));
        }
        else return a.charAt(0) + skipapple(a.substring(1));

    }

    public static void main(String[] args) {
        String a ="bcapplefg";
        System.out.println(skipapple(a));
    }
}
