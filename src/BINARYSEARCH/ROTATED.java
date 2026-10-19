package BINARYSEARCH;

public class ROTATED {
     static void main(String[] args) {
         int[] arr={5,1,2,3,4};
         int target = 3;
         int pivot=findpivot(arr);
         if (pivot ==-1) System.out.println(bs(arr,target,0,arr.length-1));
         else {
             if ( target>=arr[pivot]){
                 System.out.println(bs(arr,target,0,pivot));
             }
             else {
                 System.out.println(bs(arr,target,pivot+1,arr.length-1));
             }
         }

    }
    static int findpivot(int[] arr ) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            //4 CASES
            if (mid<hi &&  arr[mid]>arr[mid+1]){
                return mid ;
            }
            if (mid>lo && arr[mid-1]>arr[mid]){
                return mid;
            }

            if (arr[lo] >= arr[mid]) {
                hi = mid - 1;
            } else lo = mid;
        }

        return lo;
    }
    static int bs(int [] arr , int target,int start,int end ){
        while (start<=end){
            int mid = start + (end - start)/2;
            if (arr[mid]>target) end=mid-1;
            else if (arr[mid]<target) start=mid+1;
            else return mid;

        }
        return -1;
    }
    }

