package Array;
//ARRANGE ZERO
public class BUBBLESORT2 {
    public static void print(int[] arr) {
        for (int k =0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,45,6,0,0,0,5,4,8,0,4};
        for(int i =0;i<arr.length ;i ++){
            for (int j = 0 ;j<arr.length-1-i;j++){
                if (arr[j]==0 ){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }}
            }
        }
        print(arr);
    }
}
