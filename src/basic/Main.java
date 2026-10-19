package basic;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("give x");
        int x =sc.nextInt();
        System.out.println("give y");
        int y =sc.nextInt();
        if (x>0 && y>0)
            System.out.println((x+","+y+"its in first quadrant"));
        else if (x>0 && y<0)
            System.out.println("4th quadrant ");
        else if (x<0 && y<0)
            System.out.println("3rd quadrant");
        else if (x<0 && y>0)
            System.out.println(("2nd quadrant"));
        else
            System.out.println("its origin ");
    }

}