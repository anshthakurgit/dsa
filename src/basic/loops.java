package basic;

public class loops {
    public static void main(String[] args) {
        int n = 60;
        boolean a=true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n%i ==0) {
                System.out.println(i+" x "+n/i);
            }
        }

        }
    }