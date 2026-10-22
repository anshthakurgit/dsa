package STRING;

public class recurrsive {


    static String  remove(String org , String ans){
        if (org.isEmpty()) {

            return ans;
        }
        char f = org.charAt(0);
        if ( f != 'a' ){
            ans = ans+ f;
        }
        org=org.substring(1);
        return remove(org,ans);

    }

    //method two

    static String remove2 (String a , int i ){
        if (i>=a.length()){
            return a;
        }
        if (a.charAt(i)=='a') {

            if (i == 0) {
                a = a.substring(1);

            } else {
                a = a.substring(0, i) + a.substring(i + 1);
            }
            return remove2(a, i);
        }
        return remove2(a,i+1);

    }

    //KUNAL KUSHWAHA


    static void skip (String a, String p){
        if (a.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch =a.charAt(0);
        if (ch=='a'){
            skip(a.substring(1),p);
        }
        else skip(a.substring(1),p+ch);

    }

    static void main(String[] args) {
        String a= "baac";
        skip (a,"");
    }
}
