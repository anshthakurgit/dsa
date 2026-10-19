package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class noduplicate_unionofsortedarray {
    public static void main(String[] args) {
        int[]a={1,1,1,1,2,2,2,2,2,3,3,3,4,4,5,5,6,6,7,7,7,8,9,9};
        int[] b={1,1,2,2,3,4,4,4,5,6,6,7,7,8,8,9,9};
        ArrayList<Integer> sol = new ArrayList<>();
        int i=0;int j=0;
        while(i<a.length && j<b.length){
            if (a[i]==b[j]){
                if (sol.getLast()==a[i]) continue;
                else sol.add(a[i]);
                i++;j++;
            }
            else if (a[i]<b[j]) i++;
            else j++;
        }
        for (int k :sol){
            System.out.print(sol.get(k)+" ");
        }
    }
}
