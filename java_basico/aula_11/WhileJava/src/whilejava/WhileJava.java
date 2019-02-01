/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilejava;
import  java.util.Scanner;

/**
 *
 * @author pc
 */
public class WhileJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        int c= entrada.nextInt();
        
        while(c<14){
          
            c++;
            if(c==4 || c==6 || c==9){
                continue;
            }
            if(c==10){
                break;
            }
              System.out.println("Cambalhota " + c);
        }
        
    }
    
}
