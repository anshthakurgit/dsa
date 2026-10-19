package Reccursion;

public class reverse {
    static int sum=0;
    static void rem(int n ){
        if (n==0){
            return ;
        }
        int reminder = n%10;
        sum = sum*10 + reminder;
        rem(n/10);

    }
    static int rev2(int n){
        int digit = (int)(Math.log10(n) +1 );
        return (helper(n, digit));
    }
    static int helper(int n ,int digit){
        if ( n%10 ==n){
            return n ;
        }
        return n%10* (int)(Math.pow(10,digit-1)) + helper(n/10 , digit-1);
    }

    static void main(String[] args) {
        System.out.println(rev2(1342));

    }
}
