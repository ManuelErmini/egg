/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.intro.java;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class COLECCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //COLECCIONES 
        
        ArrayList<String> NombresArrayList = new ArrayList();
        
        //CON EL ARRAY LIST CREADO PONIENDO EL NOMBRE DEL ARRAY LIST Y DSP EL . TE SALEN TODOS LOS COMANDOS
        
        NombresArrayList.add("Manuel");
        NombresArrayList.add("Aquiles");
        NombresArrayList.add("Mayra");
        
        System.out.println(NombresArrayList.size());
        
        NombresArrayList.remove("Manuel");
        
        System.out.println(NombresArrayList.size());
        
        
        
        
        
        
    }
    
}
