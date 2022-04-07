package espm.poo.aula04;

import java.util.Arrays;

public class MainArray {
   
    public static void main(String[]args){

        int[] ns= new int[10];

        for(int n:ns){
            System.out.println(n);
        }

        for(int i=0; i<ns.length;i++){
            System.out.println(ns[i]);
        }

        Arrays.asList(ns).forEach(n->{System.out.println(n);});

        

       // Arrays.asList(ns).add(new int[]{1,2});
        // Arrays.asList(ns).forEach(n->System.out.println(n)); n é suportado

        int[][]matriz=new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int[]l : matriz){
            System.out.println(l);
        }
        
    }
   
}
