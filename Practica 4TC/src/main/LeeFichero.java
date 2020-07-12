
package main;

import main.Ejemplos;
import java.io.*;
import java.util.ArrayList;

//Esta clase permite leer un archivo txt 
class LeeFichero {
    //atributos
    //Declaramos un arraylist porque aqui vamos a guradar lo que tenga el txt
    ArrayList<String> datos = new ArrayList<String>();
    String tabla ="";
    String ruta="";
     
//costructor de la clase
    public LeeFichero(String ruta) {
        this.ruta=ruta;
    }
    //imprime los datos del txt este mettodo 
    public void  Leer () {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (ruta); //debemos poner la direccion del txt
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
          System.out.println("Tabla: ");
         while((linea=br.readLine())!=null){
           System.out.println(linea);
         datos.add(linea);
         
         tabla+=linea;
         
         //int i=0;
          //System.out.println(datos.get(i));
          //System.out.println(i);
           //i++;   
         }
         
          
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
    
    public void obtenerTxt(){
        
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File (ruta); //debemos poner la direccion del txt
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         while((linea=br.readLine())!=null){
          // System.out.println(linea);
         datos.add(linea);
         
         tabla+=linea;
         
         //int i=0;
          //System.out.println(datos.get(i));
          //System.out.println(i);
           //i++;   
         }
          
    
          
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
   }
    
    
   public ArrayList<String> RetornaArrayList (){
       return datos;
   } 
    
    
}