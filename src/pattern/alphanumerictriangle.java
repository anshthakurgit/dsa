package pattern;

public class alphanumerictriangle {
    public static void main (String[] args){
        int row = 8;
        for (int i=1;i<=row;i++){
            if (i%2==0){
                for (int j=1;j<=i;j++) {
                    System.out.print((char)(j+64));


                }}else{
                    for (int j=1;j<=i;j++) {
                        System.out.print(j);}}
            System.out.println();
        }
    }
}
