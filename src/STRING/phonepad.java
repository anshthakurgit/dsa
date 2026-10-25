package STRING;
import java.util.ArrayList;
public class phonepad {

    static void pad(String p , String up ){
        if ( up.isEmpty()){
            System.out.println(p);
            return ;
        }
        int digit =up.charAt(0) -'0'; // This will convert the "2" to 2 by minusing the character value

        for (int i =(digit-1)*3 ; i< digit*3 ; i++){
            char ch= (char) ('a'+i);
            pad(p+ch , up.substring(1));
        }
    }

    static ArrayList<String> padlist(String p , String up ){
        if ( up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit =up.charAt(0) -'0'; // This will convert the "2" to 2 by minusing the character value

        ArrayList<String> ans = new ArrayList<>();
        for (int i =(digit-1)*3 ; i< digit*3 ; i++){
            char ch= (char) ('a'+i);
            ans.addAll(padlist(p+ch,up.substring(1)));
        }
        return ans;
    }

    static void main(String[] args) {
        System.out.println(padlist("","12"));
    }
}
