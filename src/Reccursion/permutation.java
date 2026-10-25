package Reccursion;
import java.util.ArrayList;
public class permutation {

    static void func(String p,String up  ){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i =0 ;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            func(f+ch+s,up.substring(1));
        }

    }

    static ArrayList<String> funclist(String p,String up  ){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i =0 ;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i);
            ans.addAll(funclist(f+ch+s,up.substring(1)));
        }
        return ans;

    }

    //COUNT   KARNA

    static int funcCOUNT(String p,String up  ){
        if (up.isEmpty()){

            return 1;
        }
        char ch = up.charAt(0);
        int count = 0;
        for (int i =0 ;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count = count + funcCOUNT(f+ch+s,up.substring(1));
        }
        return count;
    }

    static void main(String[] args) {
        System.out.println(funcCOUNT("","abcD"));
    }
}
