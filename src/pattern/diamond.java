package pattern;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
     System.out.print("enter number");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int no_sp=n-1;
    int no_star=1;
        for (int l=1;l<=n;l++){
        for (int m =1;m<=no_sp;m++){
            System.out.print("  ");
        }
        for (int n1=1;n1<=no_star;n1++) {
            System.out.print("* ");
        }
        System.out.println();
        no_sp-=1;
        no_star+=2;
    }
        no_sp=1;
        no_star=(2*n-1-2);
        for (int i=1;i<=n-1;i++) {
            for (int j = 1; j <= no_sp; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= no_star; k++) {
                System.out.print("* ");
            }
            no_sp += 1;
            no_star -= 2;
            System.out.println();
        }




}


}

