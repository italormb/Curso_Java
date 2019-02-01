/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodojava;

/**
 *
 * @author pc
 */
public class MetodoJava {

    /**
     * @param args the command line arguments
     */
    static void soma(int a, int b){
	int s=a+b;
	System.out.println("Soma é " +s);
    }
    
    static int sub(int a, int b){
	int s =a-b;
	return s;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        

        soma(5,2); 
        int sub=sub(5,2);
        System.out.println("A subtraçao é "+ sub);
    }
    
}
