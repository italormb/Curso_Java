/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author pc
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1= "Ítalo";
        String nome2= "Ítalo";
        String nome3= new String("Ítalo");
        String res,res2;
        res= (nome1==nome2) ? "Igual":"Diferente";
        //res2= (nome1==nome3) ? "Igual":"Diferente";
        res2= (nome3.equals(nome1)) ? "Igual":"Diferente";
        System.out.println(res2); //na classe new a estrutura é diferente
        System.out.println(res);
                
                
    }
    
}
