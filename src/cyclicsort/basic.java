package cyclicsort;

public class basic {
    public static void main (String[] args) {
        int[] nums ={7,4,5,9,6,1,2,3,8};
        sort(nums);
        print(nums);
    }
    static void sort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct= arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else i++;

        }
    }
    static void swap(int[] arr,int first , int second){
        int temp =arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static void print(int[] arr){
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+" , ");
        }
    }
}
