package pattern;

import java.util.Scanner;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 5; // rows
        int b = 5; // columns

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                if (i==0 || i==a-1 || j==0 || j==b-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println(); // next row
        }}}
