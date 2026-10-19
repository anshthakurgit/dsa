package Array.Binarysearch;

import org.w3c.dom.ls.LSOutput;

public class count {
    public static void main(String[] args) {
        // FIRST OCCURANCE OF ZERO 'S INDEX = NO. OF NEGATIVE
        //LENGTH - LAST OCCURANCE OF ZERO -1 = N0. OF POSITIVE
        int[] nums = {0,0};
        int lo=0,hi=nums.length -1,f=-1,l=-1;
        while (lo<hi) {
            int mid = (lo+hi)/2;
            if (nums[mid]>=0){
                f=mid;
                hi=mid;
            }
            else lo=mid+1;

        }
        lo=0;hi=nums.length-1;
        while (lo<hi) {
            int mid = (lo+hi)/2;
            if (nums[mid]>0){
                l=mid;
                hi=mid;
            }
            else lo=mid+1;
        }
        int posi=nums.length-l;
        if (f==-1 && l==-1 ) System.out.println( nums.length);
        else if (f==-1) System.out.println(nums.length);
        else System.out.println( Math.max(posi, f));
    }}

