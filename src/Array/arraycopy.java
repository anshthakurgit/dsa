package Array;

import java.util.Arrays;
public class arraycopy {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int[] x= arr;
        int[] y =Arrays.copyOf(arr,arr.length);



    }
}
