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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese Dimensión de la Matriz:\nx: ");
        int x=entrada.nextInt();
        System.out.println("y: ");
        int y=entrada.nextInt();
        int valor;
        int matriz[][]=new int [x][y];
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Ingrese valor en Pos.: "+i+j);
                valor=entrada.nextInt();
                matriz[i][j]=valor;
                
                
                
               
            }
            
        }
        
        
         //llamada al metodo
        int z=x*y;
                Ejercicio11 ejercicio=new Ejercicio11();
                int resultado=ejercicio.funcion(matriz,z);
                 System.out.println("El numero q mas se repite es: "+resultado);
    }  
    
    
    public int funcion(int[][] matriz, int z)
    {
        //Pasar matriza un array
        int[] array= new int[z];
        int[] repeticiones= new int[z];
        
        int mayor=0;

        int a=0;
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                array[a]=matriz[i][j];
                a++;
            }
        }
        
        //Contar las repeteciones
        for (int i = 0; i <z; i++) {
            int cont=0;
            for (int j = 0; j < z; j++) {
                if(array[i]==array[j])
                {
                cont++;
                
                }
            }
            repeticiones[i]=cont;
        }
        
        //contar cual se repite mas
        mayor=repeticiones[0];
        for (int i = 0; i < z; i++) {
           
                
                if(repeticiones[i]>mayor)
                {
                mayor=i;
                
                
                }
            
        }
        
       mayor=array[mayor];
         return mayor;   
    }
}
