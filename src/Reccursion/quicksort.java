package Reccursion;
import java.util.Arrays;


public class quicksort {
    static void main(String[] args) {
        int [] arr = {8,3,2,1,4,5,6};
        qs(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void qs(int[] arr, int low , int high ){
        if (low<high){
            int index =func(arr,low,high);
            qs(arr,low, index -1);
            qs(arr, index +1,high);
        }

    }
    static int func(int [] arr ,int low ,int high ) {
        int pivot =arr[low];
        int i = low ;//find larger
        int j = high;//find smaller
        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }


}

