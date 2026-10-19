package Array.Binarysearch;

public class singledouble {
    class Solution {
        int single(int[] arr) {
            int lo =0 ,hi=arr.length-1;
            if (arr.length ==1 ) return arr[0];
            if (arr[lo]!=arr[lo+1]) return arr[lo];
            if (arr[hi] != arr[hi-1]) return arr[hi];


            while(lo<=hi){
                int mid= lo + (hi-lo)/2;
                if (arr[mid]!= arr[mid-1] && arr[mid]!= arr[mid +1]) return arr[mid];
                int f=mid,s=mid;
                if (arr[mid] == arr[mid-1]) f=mid-1;
                else s=mid+1;

                int leftcount= f-lo ;
                int rightcount = hi-s;
                if ((leftcount%2)== 0 ) lo = s+1;
                else hi = f-1 ;

            }
            return 888;
        }
    }
}
