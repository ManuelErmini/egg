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
public class condicionales {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
       int opinion;
       Scanner leer = new Scanner(System.in);
       System.out.println("clasifique la peli de 1 a 5 estrellas");
       opinion = leer.nextInt();
       
       if (opinion >= 1 && opinion <= 5) {
           
           switch (opinion) {
               case 1:
               case 2:
                   System.out.println("nos sentimos apenados que no hayas disfrutado la peli...");
                   break;
               case 3:
                   System.out.println("has calificado la peli como buena");
                   break;
               case 4:
                   System.out.println("has calificado la peli como muy buena");
                   break;
               case 5: 
                   System.out.println("fantastico gracias por disfrutar de una exelente peli");
                   break;
           }
       } else if (opinion < 0){
           System.out.println("bue flaco para tan poco t va a gustar la peli");
       }else if (opinion == 0){
           System.out.println("un cero tas loco vs flaco t deje de 1 a 5");
       }else if (opinion > 5){
           System.out.println("BUENO PARA UN TOQUE TAN BUENA FUE LA PELI");
       }
    
       System.out.println("HASTA LA PROXIMA FLACO VIVA WAR");
       
       
       
       
       
       
       
       
       
       
  }  
}