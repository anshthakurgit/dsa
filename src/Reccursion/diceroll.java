package Reccursion;

import java.util.ArrayList;

public class diceroll {

    static void dice(String p ,int target){
                if (target==0){
                    System.out.print(p+" ");
                    return;}

                for(int i =1 ; i<=6 && i<=target ; i++){
                    dice(p+i,target-i);

        }

    }

    static ArrayList<String> dieret(String p , int target ){
        if ( target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans  = new ArrayList<>();
        for(int i =1 ; i<=6 && i<=target;i++){
            ans.addAll(dieret(p+i,target-i));
        }
        return ans;
    }

    static void diceface(String p ,int target,int face ){
        if (target==0){
            System.out.print(p+" ");
            return;}

        for(int i =1 ; i<=face && i<=target ; i++){
            diceface(p+i,target-i,face);

        }

    }


    static ArrayList<String> diefaceret(String p , int target,int face ){
        if ( target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans  = new ArrayList<>();
        for(int i =1 ; i<=face && i<=target;i++){
            ans.addAll(diefaceret(p+i,target-i,face));
        }
        return ans;
    }

    static void main(String[] args) {
        dice("",4);
        diceface("",4,7);
        System.out.println(dieret("",4));
        System.out.println(diefaceret("",7,7));
    }
}
