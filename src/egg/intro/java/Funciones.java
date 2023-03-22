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
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int resultado = suma(10,10);
        System.out.println(resultado);
        
        
        
        
        saludopersonalizado("manuel");
        
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        saludopersonalizado(nombre);
    }
    
    // funcion //
    public static int suma (int a, int b){
        int resultado = a + b;
        
        
        return resultado;
    }
    
    public static void saludopersonalizado(String nombre) {
        System.out.println("hola"+nombre+"como estas");
        
    }
    
    
}
