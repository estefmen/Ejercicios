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
        String res = "";
       // int[][] M = new int[3][3];
        for (int a = 0; a < M.length / 2; a++) {
            for (int i = a; i < (M.length-1) - a; i++) {
            res = res + M[a][i];
        }
        for (int i = a; i < M.length - a; i++) {
            res = res + M[i][(M.length-1) - a];
        }
        for (int i = (M.length-1) - a; i >= a; i--) {
            res = res + M[(M.length-1) - a ][i];
        }
        for (int i = (M.length-1) - a ; i >= a; i--) {
            res = res +M[i][a];
        }
        }
        if (M.length % 2 == 1) {
            res = res + M[(M.length / 2)][(M.length / 2)];
        }
        return res;
    }
}
