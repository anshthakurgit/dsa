package Reccursion;
import java.util.ArrayList;

public class subsequences {
    static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        int[] arr ={3,1,2};
        subs(nums,0,arr);

    }
    static void subs(ArrayList<Integer>nums , int i ,int [] arr){
        if (i == arr.length){
            System.out.println(nums);
            return;
        }
        //        TAKE
        nums.add(arr[i]);
        subs(nums,i+1,arr);

        //not take

        nums.removeLast();
        subs(nums,i+1,arr);

    }
}
