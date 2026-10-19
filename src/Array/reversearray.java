package Array;//MOVING SOME PART OF ARRAY


import java.util.Scanner;
public class reversearray {
    public static void reverse(int[] arr , int i,int j){
    while (i<j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;

        }

   }
    public static void main(String[] args) {
        int[] arrr= {3,4,6,5,3,36,6,3};
        Scanner sc= new Scanner(System.in);
        int d =sc.nextInt();
        d=d%arrr.length; // jayda rotate na karna padega
    reverse(arrr,0,d-1);
    reverse(arrr,d,arrr.length-1);
    reverse(arrr,0,arrr.length-1);
    for (int k=0;k<arrr.length;k++){
        System.out.print(arrr[k]+ " ");
    }

    }
}
