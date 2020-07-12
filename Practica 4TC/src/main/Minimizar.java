/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;
import static main.main.data;

/**
 *
 * @author nschu
 */

public class Minimizar {
String ruta="";
ArrayList<String> data = new ArrayList<String>();
//LeeFichero obj = new LeeFichero(ruta);



public void minimizar(){
     ruta=main.ruta; 
     String tabla="";
    LeeFichero obj = new LeeFichero(ruta);
    GuardarArchivo obj2 = new GuardarArchivo(); 
    System.out.println("ruta: "+ruta);
   obj.obtenerTxt();
   data=obj.datos;
   System.out.println(data);
   char[ ] arreglo = LisToArray(data);
    System.out.println("Estados de Aceptacion: "+Aceptacion(arreglo));
    System.out.println("Estados Muertos: "+Muerto(arreglo));
   
     
}

public String Aceptacion (char [] chars){
    String aceptacion="";
        String muerto="";
        for(int i=0 ; i<chars.length; i++){
            if(chars[i]=='*'){
                aceptacion+=chars[i+1];
                
            }else if (chars[i]=='-'){
                muerto+=chars[i+1];
            }
        
        }
        return aceptacion;
}

public String Muerto (char [] chars){
    String aceptacion="";
        String muerto="";
        for(int i=0 ; i<chars.length; i++){
            if(chars[i]=='*'){
                aceptacion+=chars[i+1];
                
            }else if (chars[i]=='-'){
                muerto+=chars[i+1];
            }
        
        }
        return muerto;
}





 public char [] LisToArray(ArrayList data){
      char[] chars = data.toString().toCharArray();
        String str=data.toString().replaceAll(",", "");
         return chars = str.substring(1, str.length()-1).replaceAll(" ", "").toCharArray();
 }

    
    public String getRuta() {
       String ruta="";
        return ruta;
    }
    

  public void imprimirMatriz (char matriz [] []){
     for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {
    System.out.print (matriz[x][y]+" ");
  }System.out.println("");
}
    } 

}


  /*    
        System.out.println("Estados de Aceptacion: "+acpetacion);
        System.out.println("Estado Mueto: "+muerto);
        System.out.println("Matriz de Aceptacion");
      char [] X = acpetacion.toCharArray(); //grupo de aceptacion 
      char [] Y =muerto.toCharArray(); //grupo no aceptado
      char aceptado[][] = new char[3][3];
      char noAceptado[][] = new char[4][3];
      aceptado[0][0]='ς'; aceptado[0][1]='0'; aceptado[0][2]='1';
      aceptado[1][0]=X[0]; aceptado[1][1]='x'; aceptado[1][2]='x';
      aceptado[2][0]=X[1]; aceptado[2][1]='x'; aceptado[2][2]='x';
      
       imprimirMatriz(aceptado);
       System.out.println("Matris z¿ de no acepetaacion: ");
      noAceptado[0][0]='ς'; noAceptado[0][1]='0'; noAceptado[0][2]='1';
      noAceptado[0][0]='ς'; noAceptado[0][1]='0'; noAceptado[0][2]='1';
      noAceptado[0][0]='ς'; noAceptado[0][1]='0'; noAceptado[0][2]='1';
      
    }
   
   public void imprimirMatriz (char matriz [] []){
     for (int x=0; x < matriz.length; x++) {
  for (int y=0; y < matriz[x].length; y++) {
    System.out.print (matriz[x][y]+" ");
  }System.out.println("");
}
    } 
    */