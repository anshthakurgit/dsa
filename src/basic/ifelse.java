package basic;

import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt(); int b = sc.nextInt(); int c =sc.nextInt();
        if (a>b) {
            if (a > c)
            System.out.print(a + "is greatest");
                else
                    System.out.println(c + " is greatest");
        } else {
            if (b > c)
                System.out.print(b + "is greatest");
            else
                System.out.println(c + "is greatest");
        }

        }
}
