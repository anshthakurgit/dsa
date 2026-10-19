package Array;

public class bubble3 {
    public static void print(int[] arr) {
        for (int k =0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,45,6,0,0,0,5,4,8,0,4};
        int n=arr.length ;
        int j=0;
        for (int i =0 ; i<n;i++){
            if (arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        print(arr);
    }
}
