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
public class Ejercicio16 {

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
        
                Ejercicio16 ejercicio=new Ejercicio16();
                int resultado=ejercicio.serie(x,y,z);
                 System.out.println("El numero"+z+" de la serie es: "+resultado);
    }
    
    
    public int serie(int x, int y , int z){
        int cont = 0;
        int a = 2;
        
        int vector[] = new int[z+1];
        if (y>z) {
            return 0;
        }
        if ((x<=0)||(x>255)||(y<=0)||(y>255)||(z<=0)||(z>255)) {
            return -1;
        }

        
        vector[0]=x;
        
        for (int i = 1; i < z; i++) {
            vector[i]=vector[i-1]*a;
            a=a+2;
        }
        
        int acum=0;
        for (int i = y-1; i < z; i++) {
            acum = acum + vector[i];
        }
        return acum;
    }
    
    
}
