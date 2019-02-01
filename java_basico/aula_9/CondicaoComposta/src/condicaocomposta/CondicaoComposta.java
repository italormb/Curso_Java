/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicaocomposta;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class CondicaoComposta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        float an= teclado.nextFloat();
        float idade= 2019-an;
        if (idade> 18){
            System.out.println("Você é maior de idade");
        }
        else{
            System.out.println("Você é menor de Idade");
        }
        System.out.println("Sua idade é " + idade);
    }
    
}
