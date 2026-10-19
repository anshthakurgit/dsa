package Reccursion;
import java.util.ArrayList;

public class recursive {
    static ArrayList<Integer> findallindex2(int[] arr , int target , int index){
        ArrayList<Integer> ans = new ArrayList<>();
        if (index == arr.length){
            return ans;
        }
        if (arr[index] == target ){
            ans.add(index);
        }
        ArrayList<Integer> ansfrombelow =  findallindex2(arr,target,index+1);
        ans.addAll(ansfrombelow);
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int target = 4;
        System.out.print(findallindex2(arr,target , 0));
    }
}
