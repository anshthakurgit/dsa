package STRING;

import java.util.ArrayList;

public class subsequences {
    //  subsequences are for the strings

    static void subseq1(String p , String up){
        if (up == ""){
            System.out.println(p);
            return;
        }

        //TAKE
        char ch = up.charAt(0);
        subseq1(p+ch,up.substring(1));
        subseq1(p,up.substring(1));


    }



    static void subseq(String p , String up){
        if (up == ""){
            System.out.println(p);
            return;
        }

        //TAKE
        p=p+up.charAt(0);
        subseq(p,up.substring(1));
        //NOT TAKE
        p=p.substring(0,p.length()-1);
        subseq(p,up.substring(1));


    }


    static ArrayList<String> subseqret(String p , String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left= subseqret(p+ch,up.substring(1));
        ArrayList<String> right = subseqret(p,up.substring(1));

        left.addAll(right);
        return left;

    }

    static void main(String[] args) {
        String test ="abc";
        System.out.println(subseqret("",test));
    }
}
