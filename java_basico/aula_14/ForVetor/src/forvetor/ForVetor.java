/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forvetor;

import java.util.Arrays;

/**
 *
 * @author pc
 */
public class ForVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[]= {3,-5,35,-67,4};
        int pos = Arrays.binarySearch(v,4);
        System.out.println("A posição é " + pos*-1);
        Arrays.sort(v);
        for(double valor:v){
            System.out.println(valor + " ");
        }
    }
    
    /*int vet[]= new int[5];
      Arrays.fill(vet,5);*/
    
}
