package Array;
import java.util.ArrayList;
import java.util.Arrays;
public class commonelement {
    static void main(String[] args) {
        int[] a={1,1,1,1,1,2,2,2,2,2,5,4,6,9,8,7};
        int[] b={1,1,2,2,3,4,5,6,8,7};
        int i=0;
        int j=0;

        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> sol = new ArrayList<>();
        while (i<a.length && j<b.length){
            if (a[i] == b[j]){
                sol.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]<b[j]) i++;
            else j++;
        }
        for(int k: sol){
            System.out.print(sol.get(k)+" ");
        }

            }
}
