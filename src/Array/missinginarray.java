package Array;

public class missinginarray {
    public static void main(String[] args) {
        //You are given an array arr[] of size n - 1 that contains distinct
        // integers in the range from 1 to n (inclusive).
        // This array represents a permutation of the integers from 1 to n
        // with one element missing.
        // Your task is to identify and return the missing element
        int [] arr= {1,2,3,4,5,6,8};
        long n = arr.length +1;
        long sum = n*(n+1)/2;
        long suma=0;
        for (int i : arr){
            suma +=i;
        }
        System.out.println(sum-suma);



    }
}
