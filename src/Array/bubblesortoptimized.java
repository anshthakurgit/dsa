package Array;

public class bubblesortoptimized {
        public static void print(int[] arr) {
            for (int k =0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }

        }
        public static void main(String[] args) {
            int[] arr = {1,2,45,6,5,4,8,4};
            for(int i =0;i<arr.length ;i ++) {
//                boolean issort=true;
//                for (int l=0;l<arr.length-1;l++){
//                    if (arr[l]>arr[l+1]){
//                        issort=false;
//                    }
//                }
//                if (issort==true) break;
//                for (int j = 0 ;j<arr.length-1-i;j++){
//                    if (arr[j]>arr[j+1]){
//                        int temp = arr[j];
//                        arr[j]=arr[j+1];
//                        arr[j+1]=temp;
//
//                    }
//                }
                int swap = 0;
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swap++;

                    }
                }
                if (swap == 0) break;

            }
            print(arr);
        }
    }

// TWO TYPES OD OPTIMIZED CODE