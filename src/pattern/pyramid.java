package pattern;

import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
            System.out.print("enter number");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
//            for (int i=0;i<n;i++){
//                for(int j=1;j<n-i;j++) {
//                    System.out.print(" ");
//                }
//                for (int k=0;k<2*i+1;k++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }

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

        }


}
