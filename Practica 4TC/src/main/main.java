/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author nschu
 */
public class main {
    //creamos arraylist para guradar los datos del aarylist de la clase LeeFichero
    //osea copiamos el arraylist que teiene la informacion a este
    static   ArrayList<String> data = new ArrayList<String>();
    
   static String ruta="";
    public main() {
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int opcion=0;
        System.out.println("Opcion");
        opcion=sc.nextInt();
        LeeFichero op ;
        Minimizar op2 = new  Minimizar();
        String ruta="";
        
        switch(opcion){
            case 1: System.out.println("Leer txt 1 Ejemplo ");
            ruta="src\\Ejemplos\\hola.txt"; 
            op= new  LeeFichero(ruta);
            main.ruta= ruta;
            op.Leer();
           op2.minimizar();
            break;
            
            case 2:System.out.println("Leer txt 2 Ejemplo ");
             ruta="src\\Ejemplos\\hola2.txt";
            op= new  LeeFichero(ruta);
            main.ruta= ruta;
            op.Leer();
            op2.minimizar();
                 break;
               
            case 3 :System.out.println("Leer txt 2 Ejemplo ");
            ruta="src\\Ejemplos\\hola3.txt";     
             main.ruta= ruta;
            op= new  LeeFichero(ruta);
                  op.Leer();
                  break;
        } 
        
        

    }
       public String ObtenerRuta(String ruta){
        return this.ruta;
    }
}