package Reccursion;

public class basic {

    public static void main(String[] args) {
//        System.out.println(fibonachi(6));
//        print1ton(5);
//        System.out.println(factorial(1));
        System.out.println();
    }

    static int fibonachi(int n ) {
        if (n<2){
            return n;
        }
        return fibonachi(n-1)+fibonachi(n-2);
    }

    static void  print1ton(int n){
        if (n==0){
                return ;}
        print1ton(n-1);
        System.out.println(n);

    }

    static void printnto1(int n ){
        System.out.println(n);
        if (n==0){
            return ;
        }
        print1ton(n-1);
    }

     static int factorial(int n ) {
         if (n == 0) {
             return 1;
         }
         return n * factorial(n - 1);

     }

    static int sum(int n ){

        if (n ==0 ) {
            return 0 ;
        }
        return n + sum(n - 1);

    }

    static int sumofdigit(int n ){
        if (n==0){
            return 0;
        }
        int step1= n%10;
        int step2=n/10;
        return step1+sumofdigit(step2);
    }

}
