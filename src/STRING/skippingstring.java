package STRING;

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

    static String skipappnotapple(String a){
        if (a.isEmpty()){
            return "";
        }

        if (a.startsWith("app") && !a.startsWith("apple")){
            return skipappnotapple(a.substring(3));
        }
        else return a.charAt(0) + skipappnotapple(a.substring(1));

    }

    public static void main(String[] args) {
        String a ="bcapplefg";
        System.out.println(skipappnotapple(a));
    }
}
