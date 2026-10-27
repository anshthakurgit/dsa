package backtrackking;

import java.util.ArrayList;

public class maze {

    //COUNT

    static int count (int r , int c ){
        if (r==1 | c==1){
            return 1;
        }
    int left =count(r-1,c);
    int right = count (r,c-1);
    return left + right ;
    }

    //PATH

    static void mazepath(String p , int r , int c){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            mazepath(p+"D" ,r-1,c);
        }
        if (c>1){
            mazepath(p+"R",r,c-1);
        }
    }

    static void mazepathdiagonal(String p , int r , int c){
        if (r==1 && c==1){
            System.out.print(p + " ");
            return;
        }
        if(r>1 && c>1){
            mazepathdiagonal(p+"D",r-1,c-1);
        }
        if (r>1){
            mazepathdiagonal(p+"V" ,r-1,c);
        }
        if (c>1){
            mazepathdiagonal(p+"H",r,c-1);
        }
    }

    // RESTRICTIONS


    static void mazepathrestriction(String p ,boolean [][] maze, int r , int c){
        if (r==maze.length -1  && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]){
            return;
        }
        if (r<maze.length -1 ){
            mazepathrestriction(p+"D" ,maze,r+1,c);
        }
        if (c<maze[0].length -1 ){
            mazepathrestriction(p+"R",maze,r,c+1);
        }
    }

    static void main(String[] args) {
        //System.out.println(count(3,3));
        boolean [][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazepathrestriction("",board,0,0);
    }
}
