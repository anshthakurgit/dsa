package basic;

public class loop2 {
    public static void main (String [] args){
        int in=63485;
        int a =0;
        while (in != 0){
            a=a*10 + (in%10) ;
            in=in/10;;
            }

        System.out.println("reverse"+ a);}
    }

