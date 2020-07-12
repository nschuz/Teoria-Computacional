
import java.util.ArrayList;
import java.util.Random;


public class persona {
     String nombre, apellidoP, apellidoM, fecha, sexo, entidad, mes, dia,año, cons="";
     int m, d, a;
     //ArrayList<String> datos = new ArrayList <String>();
    public persona(){
        Random rand = new Random();
        String [] apellidosP  = {"Hernández", "Miranda", "Jimenez", "Guzman", "Escobar", "Acosta", "Caballero", "Franco", "Cordero"};
        String [] apellidosM  ={"Flores", "García", "Zamora", "Gomez", "Iglesias", "Lazaro", "Jurado", "Navarro", "Escamilla"};
        String [] nombres  = {"Juan", "Edgardo", "Arturo", "Carlos", "Mariana", "Fernanda", "Daniela", "Citlalli", "Pedro"};
        String [] entidades ={"AS","CC","CM","CH","DG","GR","JC","MN","NT","OC","QT","SP","SR","TS","VZ","ZS","NE"};
        nombre=nombres[rand.nextInt(9)];
        apellidoP=apellidosP[rand.nextInt(9)];
        apellidoM=apellidosM[rand.nextInt(9)];
        m = (int)(Math.random() * 12) + 1;
        d = (int)(Math.random() * 30) + 1;
        a = (int)(Math.random() * 99) + 1;
        if(m<10)
            mes="0"+m;
        else
            mes=""+m;
        if(a<10)
            año="0"+a;
        else
            año=""+a;
        if(d<10)
            dia="0"+d;
        else
            dia=""+d;
        fecha=año+mes+dia;
        if(nombre.equals("Mariana")||nombre.equals("Fernanda")||nombre.equals("Daniela")||nombre.equals("Citlalli")){
            sexo="M";
        }else{
            sexo="H";
        }
        entidad=entidades[rand.nextInt(17)];
        for(int i=1;i<apellidoP.length();i++)
            if(apellidoP.charAt(i)!='a'&&apellidoP.charAt(i)!='e'&&apellidoP.charAt(i)!='i'&&apellidoP.charAt(i)!='o'&&apellidoP.charAt(i)!='u'){
                cons+=apellidoP.charAt(i);
                break;
            }
        for(int i=1;i<apellidoM.length();i++)
            if(apellidoM.charAt(i)!='a'&&apellidoM.charAt(i)!='e'&&apellidoM.charAt(i)!='i'&&apellidoM.charAt(i)!='o'&&apellidoM.charAt(i)!='u'){
                cons+=apellidoM.charAt(i);
                break;
            }
        for(int i=1;i<nombre.length();i++)
            if(nombre.charAt(i)!='a'&&nombre.charAt(i)!='e'&&nombre.charAt(i)!='i'&&nombre.charAt(i)!='o'&&nombre.charAt(i)!='u'){
                cons+=nombre.charAt(i);
                break;
            }
    }
    public String toString(){
        return "Nombre: "+nombre + "\nApellido Paterno: " + apellidoP + "\nApellido Materno: "
                + apellidoM + "\nFecha de nacimiento: " + fecha.substring(0, 2)+"-"+ fecha.substring(2, 4) +"-"+ fecha.substring(4, 6) +
                "\nSexo: "  + sexo + "\nEntidad Federativa: " + entidad;
    }
    
}
