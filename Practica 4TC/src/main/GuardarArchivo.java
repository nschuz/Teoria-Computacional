package main;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;

public class GuardarArchivo{
    main obj = new main();
    
    public void Guarda(ArrayList<String> data ) {
        Formatter archivo = null;
        ArrayList<String> guarda = new ArrayList<String>();
        guarda=(ArrayList<String>) data.clone();
        try{
            archivo = new Formatter("D:\\hola3.txt");
       
 /*Iterator<String> i = data.iterator();
while(i.hasNext()){
	String elemento = i.next();
	System.out.print(elemento+" / ");
         archivo.format(" %s ", guarda );
}*/
         archivo.format(" %s ", "Tabla Minimizada" );
         archivo.format(" %s %s", guarda, "\r" );
        }catch(Exception e){
            System.out.println("Ha ocurrido un error "+e.toString());
        }finally {
            archivo.close();
        }
    
    
}
}
