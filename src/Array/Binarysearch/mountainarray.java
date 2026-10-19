package Array.Binarysearch;
public class mountainarray {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,3,4,5,6,7,7,8,8,6,3};
        int lo =0;
        int hi=arr.length -1;
        while (lo<hi){
            int mid =(lo+hi)/2;
            if (arr[mid]<=arr[mid+1]) lo=mid+1;
            else hi=mid;
        }
        System.out.print(arr[lo]);


}}
