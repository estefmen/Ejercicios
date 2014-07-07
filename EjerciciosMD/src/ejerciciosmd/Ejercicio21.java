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
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Ingrese Dimensión de la Matriz:\nx: ");
        int x=entrada.nextInt();
        
        int y=x;
        String valor;
        String matriz[][]=new String [x][y];
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Ingrese valor en Pos.: "+i+j);
                valor=entrada.next();
                matriz[i][j]=valor;  
            }
            
        }
        
        
         //llamada al metodo
        
                Ejercicio21 ejercicio=new Ejercicio21();
                String resultado=ejercicio.Matriz1(matriz);
                 System.out.println("El numero q mas se repite es: "+resultado);
    }
     public String Matriz1(String [][]M){
        String res = null;
       // int[][] M = new int[3][3];
        for (int a = 0; a < 3 / 2; a++) {
            for (int i = a; i < 3 - a; i++) {
            res = res + String.valueOf(M[a][i]);
        }
        for (int i = a; i < 3 - a; i++) {
            res = res + String.valueOf(M[i][3 - a + 1]);
        }
        for (int i = 3 - a + 1; i >= a + 1; i--) {
            res = res + String.valueOf(M[3 - a + 1][i]);
        }
        for (int i = 3 - a + 1; i >= a + 1; i--) {
            res = res + String.valueOf(M[i][a]);
        }
        }
        if (3 % 2 == 1) {
            res = res + String.valueOf(M[3 / 2 + 1][3 / 2 + 1]);
        }
        return res;
    }
}
