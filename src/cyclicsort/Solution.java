package cyclicsort;

class missing {
    static void main(String[] args) {
        int[] a={3,0,1};
        System.out.println(missingNumber(a));
    }
    static int missingNumber(int[] arr) {
        //CYCLIC SORT 
        int i=0;
        while (i<arr.length){
            int correct = arr[i];
            if (arr[i]<arr.length  && arr[i]!=i){
                swap(arr,i,correct);
            }
            else i++;
        }
        //FINDING
        for(int k=0;k<arr.length;k++){
            if (arr[k]!=k){
                return k;
            }

        }
        return arr.length;
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }

}