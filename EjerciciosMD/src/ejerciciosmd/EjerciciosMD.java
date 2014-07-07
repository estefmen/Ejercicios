/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosmd;

import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class EjerciciosMD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n=0; int menor=0; int posicion =0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del entero n"));
        int[] arreglo1=new int[n];
        int[] arregloauxiliar=new int[n];
        for (int i = 0; i < n; i++) {
            arreglo1 [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores al vector"));
        }
         
         for (int i = 0; i < n; i++) {
             if (arreglo1[i] < 0) {
                arregloauxiliar[posicion]= arreglo1[i];
                posicion++;
             }
         }
         for (int i = 0; i < n; i++) {
            if (arreglo1[i] >= 0) {
                arregloauxiliar[posicion]= arreglo1[i];
                posicion++;
             }
        }
         for (int i :arregloauxiliar) {
        System.out.printf("%d ",i);
    }
    }
    
}
