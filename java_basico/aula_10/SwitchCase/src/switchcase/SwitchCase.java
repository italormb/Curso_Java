/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        
        int pernas = teclado.nextInt();
        
        String tipo;

    switch(pernas)
    {
	case 1: 
	tipo="saci";
	break;
	case 2:
	tipo= "bipede";
	break;
	case 6:
	tipo= "aranha";
	break;
	default:
	tipo="et";
	
        
    }
        System.out.println(tipo);
}
    
}
