package STRING;

import java.io.PrintStream;

public class basic {
    static void main() {
        float b =48.5694f;
        System.out.printf("PLACE HOLDER : %s %.2f ", "ansh", b);

        //STRING BUILDER

        StringBuilder a = new StringBuilder();
        for(int i =0 ;i<26;i++){
            char ch = (char)('a'+1);
            a.append(ch);
        }
        System.out.println(a.toString());
    }
}
