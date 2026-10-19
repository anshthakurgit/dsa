package Array.Binarysearch;

public class floor {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8,9};
        int lo=0,hi=arr.length -1,index=-1,target= 7;
        while (lo <= hi) {
            int mid =(lo+hi)/2;
            if (arr[mid]==target) {
                index=mid;
                break;
                }
            else if( arr[mid]<target){
                index=mid;
                lo=mid+1;
                            }
            else hi=mid-1;
        }
        System.out.println(index);
    }
}
