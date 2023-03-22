/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro.java;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ProductoVectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int[] vector;
        vector = new int[2];
        
        int[] producto = new int[3];
        
        int[][] matriz = {{4, 8, 6} , {2, 1, 7}};
        
        System.out.println("ingrese los valores del vector "+vector.length+":");
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0 ; i<vector.length ; i++){
            System.out.println("v["+i+"]=");
            vector [i] = leer.nextInt();
            
        }
        
        int sum;
        for (int j = 0; j < matriz[0].length; j++){
            sum = 0;
            
            for (int i = 0; i<vector.length; i++){
                sum+= vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        
        String aux = "";
        
        //mostrsr vector 
        
        System.out.println("* vector:");
        
        for (int elemento: vector ){
            aux = aux + "  " + elemento;
        }        
        System.out.println("aux");
        for (int [] fila: matriz) {
             aux = "";
            for (int elemento : fila ) {
                aux += "  " + elemento;
                }
            System.out.println("aux");
        }
        
        //rellenar matriz
        
        for (int x=0; x < matriz.length; x++) {
       for (int y=0; y < matriz[x].length; y++) {
       matriz[x][y] = (int) (Math.random()*9+1);
       
       }
     }
        
        
        //mostrar matriz
         for (int x=0; x < matriz.length; x++) {
        System.out.print("|");
        for (int y=0; y < matriz[x].length; y++) {
        System.out.print (matriz[x][y]);
        if (y!=matriz[x].length-1) System.out.print("\t");
        
        
        
        
        //mostrar resultado
        aux = "";
        System.out.println("\n* vector x matriz: ");
        for (int elemento: producto) {
            aux += "  " + elemento;
        }
        
        
        System.out.println("aux");
        
        
        
        
        
        
        
        
        
        
        
        
        
   
        
       }
        
        
     }
    }        
}