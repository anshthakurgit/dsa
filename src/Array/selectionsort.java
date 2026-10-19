package Array;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr ={8,5,4,5,8,4,5,9,4,8};
        int n= arr.length;
        for(int i =0 ;i<n;i++){
            int min =Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i ; j<n ;j++){
                if (min>arr[j]){
                    min=arr[j];
                    mindex=j;

                }
            }
            arr[mindex]=arr[i];
            arr[i]=min;

        }
    for(int a =0; a<n; a++){
            System.out.print(arr[a]+" ");
        }
    }
}
