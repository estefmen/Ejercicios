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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese valor de de x");
        int x=entrada.nextInt();
        System.out.println("y: ");
        int y=entrada.nextInt();
        System.out.println("z: ");
        int z=entrada.nextInt();
        
        
        
       
            
        
        
        
         //llamada al metodo
        
         Ejercicio14 ejercicio=new Ejercicio14();
                int resultado=ejercicio.serie(x,y,z);
                 System.out.println("El numero"+z+" de la serie es: "+resultado);
        // TODO code application logic here
    }
     public int serie(int x, int y, int z){
        int vector[] = new int[z+1];
        int Z = -1;
        int cont = 0;
        if ((x<=0)||(x>255)||(y<=0)||(y>255)||(z<=0)||(z>255)) {
            return Z;
        }else{
            do {
                vector[cont]= Integer.parseInt(String.valueOf(x)+String.valueOf(y));
                vector[cont+1]= Integer.parseInt(String.valueOf(y)+String.valueOf(x));
                x = x + 1;
                y = y + 1;
                cont = cont + 2;
            }while (z>=cont);
        }
        return vector[z-1];
    }
}
