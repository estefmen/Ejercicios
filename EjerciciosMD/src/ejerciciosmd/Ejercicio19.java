/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosmd;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese valor de de x");
        int x=entrada.nextInt();
        
         //llamada al metodo
        
         Ejercicio19 ejercicio=new Ejercicio19();
                int resultado=ejercicio.Binario(x);
                 System.out.println("El numero "+x+" tiene "+resultado+" uno en binario");
    }
    
    
     public int Binario(int num){
        int coc = 0, res=0,binario = 0;
        while (num >= 2){
                coc = num / 2;
                res = num % 2;
                num = coc;
                if ((res == 1)) {
                    binario++;
            }
                if ((coc == 1)) {
                    binario++;
            }
        }
        return binario;
    }
}
