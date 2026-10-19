//class Solution {
//    ArrayList<Integer> find(int arr[], int x) {
//        // code here
//        ArrayList<Integer> ans = new ArrayList<>();
//        int lo = 0;
//        int hi = arr.length - 1;
//        int index = -1;
//        while (lo <= hi) {
//            int mid = (lo + hi) / 2;
//            if (arr[mid] == x) {
//                index = mid;
//                hi = mid - 1;
//            } else if (arr[mid] > x) hi = mid - 1;
//            else lo = mid + 1;
//
//        }
//        int index2 = -1;
//        lo = 0;
//        hi = arr.length - 1;
//        while (lo <= hi) {
//            int mid = (lo + hi) / 2;
//            if (arr[mid] > x) hi = mid - 1;
//            else if (arr[mid] < x) lo = mid + 1;
//            else {
//                index2 = mid;
//                lo=mid+1;
//            }
//        }
//        ans.add(index);
//        ans.add(index2);
//        return ans;
//
//    }
//}
