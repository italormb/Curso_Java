/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamedia;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ProgramaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        float n1= teclado.nextFloat();
        float n2= teclado.nextFloat();
        float media= (n1 + n2)/2;
        
        System.out.println("Sua média é " + media);
        if (media>9){
            System.out.println("Parabéns");
        }
       
    }
    
}
