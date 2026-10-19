package Array;
import java.util.Arrays;
public class twosum {
    public static void print(int[] arr) {
        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= {4,5,6,4,2,1,5,7,9,3,2,5,6,1};
        Arrays.sort(arr);
        print(arr);
        int i=0;
        int j= arr.length -1;
        int target =13;
        while (i<j) {
            if (arr[i]+arr[j] == target){
                System.out.println(i+" " + j);
                break;
            }
            else if (arr[i]+arr[j] > target ){
                j--;
            }
            else i++;
        }



    }
}
