import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Alfabetos {

    Scanner sc = new Scanner(System.in);
    static ArrayList<Character> alfabeto1;
    static ArrayList<Character> alfabeto2;
    static ArrayList<Character> cadena1;
    static ArrayList<Character> cadena2;
    //
    static ArrayList<String> Lenguaje1 = new ArrayList<String>();
    static ArrayList<String> Lenguaje2 = new ArrayList<String>();

    public static void main(String[] args) {
        int opcion;
        Alfabetos miobjeto = new Alfabetos();
        Alfabetos miobjeto2 = new Alfabetos();
        miobjeto.alfabeto1 = new ArrayList<Character>();
        miobjeto2.alfabeto2 = new ArrayList<Character>();
        miobjeto.cadena1 = new ArrayList<Character>();
        miobjeto.cadena2 = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        ////////////////////
        do{
        System.out.println("");
        System.out.println("****MENU*****\n1. Lenguajes\n2. CURP\n3. Expresion Regular");
        opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    miobjeto.Opcion();
                    miobjeto.mostarAlafabeto();
                    System.out.println("");
                    miobjeto.generarLenguaje();
                    System.out.println("");
                    miobjeto.unionLenguajes();
                    System.out.println("");
                    miobjeto.potenciaLenguaje();
                    break;
                case 2:
                    miobjeto.curp();
                    break;
                case 3:
                    miobjeto.ExpresionRegular();
                    break;
            }
        }while(opcion<=3);
        
        
       

    }

    public void Opcion() {
        Scanner sc = new Scanner(System.in);
        int opcionn;

        System.out.printf("---Alfabeto 1---");
        System.out.println("Inserte: \n 1.para insertar caracater \n 2.Insertar un rango");
        opcionn = sc.nextInt();
        if (opcionn == 1) {
            ingresarValor();
        } else {
            ingesaRango();
        }

    }

    public void OpcionDos() {
        Scanner sc = new Scanner(System.in);
        int opcionn;
        System.out.println("---Alfabeto 2---");
        System.out.println("Inserte: \n 1.para insertar caracater \n 2.Insertar un rango");
        opcionn = sc.nextInt();
        if (opcionn == 1) {
            ingresarValorDos();
        } else {
            ingesaRangoDos();
        }

    }

    public void ingresarValor() {
        Scanner sc = new Scanner(System.in);
        char caracter;
        System.out.println("Ingrese un caracater ,  para detener presione '+' : ");
        int contador = 1;
        boolean bandera = false;

        do {
            do {
                caracter = sc.next().charAt(0);
                if (caracter != '+') {
                    //System.out.println("hola");
                    // System.out.println("pep");
                    alfabeto1.add(caracter);
                    contador++;

                } else if (caracter == '+' && contador <= 3) {
                    System.out.println("Debe insertar un minimo de 3 caracteres");
                    alfabeto1.clear();
                    contador = 1;
                }

            } while (caracter != '+' || contador <= 3);

            for (int i = 0; i < alfabeto1.size() - 1; i++) {

                if (alfabeto1.get(i).equals(alfabeto1.get(i + 1))) {
                    bandera = true;
                    break;
                } else {
                    bandera = false;
                }
            }
            if (bandera == true) {
                System.out.println("Tiene elemntos repetidos intente de nuevo");
                alfabeto1.clear();
                contador = 1;
            }

        } while (bandera == true);
    }

    public void ingresarValorDos() {
        Scanner sc = new Scanner(System.in);
        char caracter;
        System.out.println("Ingrese un caracater ,  para detener presione '+' : ");
        int contador = 1;
        boolean bandera = false;

        do {
            do {
                caracter = sc.next().charAt(0);
                if (caracter != '+') {
                    //System.out.println("hola");
                    // System.out.println("pep");
                    alfabeto2.add(caracter);
                    contador++;

                } else if (caracter == '+' && contador <= 3) {
                    System.out.println("Debe insertar un minimo de 3 caracteres");
                    alfabeto2.clear();
                    contador = 1;
                }

            } while (caracter != '+' || contador <= 3);

            for (int i = 0; i < alfabeto2.size() - 1; i++) {

                if (alfabeto2.get(i).equals(alfabeto2.get(i + 1))) {
                    bandera = true;
                    break;
                } else {
                    bandera = false;
                }
            }
            if (bandera == true) {
                System.out.println("Tiene elemntos repetidos intente de nuevo");
                alfabeto2.clear();
                contador = 1;
            }

        } while (bandera == true);

    }

    public void ingesaRango() {
        Scanner sc = new Scanner(System.in);
        char rangoinicial, rangofinal;
        System.out.println("Primer Caracter: ");
        rangoinicial = sc.next().charAt(0);
        System.out.println("Ultimo Caracter");
        rangofinal = sc.next().charAt(0);
        int resta = rangofinal - rangoinicial;
        int i = 0;
        for (i = rangoinicial; i <= rangofinal; i++) {
            char c = (char) i;

            alfabeto1.add(c);

        }
    }

    public void ingesaRangoDos() {
        Scanner sc = new Scanner(System.in);
        char rangoinicial, rangofinal;
        System.out.println("Primer Caracter: ");
        rangoinicial = sc.next().charAt(0);
        System.out.println("Ultimo Caracter");
        rangofinal = sc.next().charAt(0);
        int resta = rangofinal - rangoinicial;
        int i = 0;
        for (i = rangoinicial; i <= rangofinal; i++) {
            //System.out.println(i);
            char c = (char) i;
            //System.out.println(c);
            alfabeto2.add(c);

        }

    }

    public void mostarAlafabeto() {
        if (!alfabeto1.isEmpty()) {
            System.out.println();
            System.out.println("---Alfabeto 1---");
            System.out.print("[");
            for (int i = 0; i < alfabeto1.size(); i++) {
                System.out.print(alfabeto1.get(i) + ",");

            }
            System.out.print("]");
        } else {
            System.out.println("Alfabeto Vacio");
        }
    }

    public void mostarAlafabetoDos() {
        if (!alfabeto2.isEmpty()) {
            System.out.println();
            System.out.println("---Alfabeto 2---");
            System.out.print("[");
            for (int i = 0; i < alfabeto2.size(); i++) {
                System.out.print(alfabeto2.get(i) + ",");

            }
            System.out.print("]");
        } else {
            System.out.println("Alfabeto Vacio");
        }

    }

    public void insertarCadena() {
        //  Alfabetos miobject = new Alfabetos();
        String cadenauno = "";
        String cadenados = "";
        boolean bandera = false;
        char caracter;
        do {
            cadena1.clear();
            int contador = 0;
            System.out.println("\nCadena1 --Introduce una cadena 'w' dentro de alfabeto 1");
            cadenauno = sc.next();
            System.out.println(cadenauno);
            for (int i = 0; i < cadenauno.length(); i++) {
                caracter = cadenauno.charAt(i);
                cadena1.add(caracter);
                for (int j = 0; j < alfabeto1.size(); j++) {
                    if (cadena1.get(i).equals(alfabeto1.get(j))) {
                        bandera = true;
                        //  System.out.println("good");
                        contador++;
                    }
                }

            }
            System.out.println("contador: " + contador + " cadenauno: " + cadenauno.length());
            if (contador == cadenauno.length()) {
                bandera = true;
            } else {
                bandera = false;
            }
        } while (bandera == false);

        bandera = false;
        do {
            cadena2.clear();
            int condor2 = 0;
            System.out.println("Cadena2 --Introduce una cadena 'w' dentro de alfabeto 1");
            cadenados = sc.next();
            System.out.println(cadenados);
            for (int i = 0; i < cadenados.length(); i++) {
                caracter = cadenados.charAt(i);
                cadena2.add(caracter);
                for (int j = 0; j < alfabeto1.size(); j++) {
                    if (cadena2.get(i).equals(alfabeto1.get(j))) {
                        bandera = true;
                        //System.out.println("good");
                        condor2++;
                    }

                }

            }
            System.out.println("contador: " + condor2 + " cadenados: " + cadenados.length());
            if (condor2 == cadenados.length()) {
                bandera = true;
            } else {
                bandera = false;
            }
        } while (bandera == false);

    }

    public void palindromo() {
        Scanner entrada = new Scanner(System.in);
        int pos = 0;
        StringBuffer frase, inversa;
        String s1, s2;
        System.out.println("Introduzca una frase. Este programa comprobará si se trata o no de un palíndromo.");
        frase = new StringBuffer(entrada.nextLine());
        while (pos < frase.length()) //si utilizamos for, dejamos la parte de pos++ vacía
        {
            if (!Character.isLetter(frase.charAt(pos))) {
                frase.deleteCharAt(pos);
            } else {
                pos++;
            }
        }
        inversa = new StringBuffer(frase);
        inversa.reverse();
        s1 = frase.toString();
        s2 = inversa.toString();
        if (s1.equalsIgnoreCase(s2)) //ignora si hay mayusculas o minisculas
        {
            System.out.println("La frase introducida es un palíndromo.");
        } else {
            System.out.println("La frase introducida no es un palíndromo.");
        }

    }

    public void NumeroDeOcurrenciasSimbolo() {
        System.out.println("Introduzca el simbolo a contar: ");
        char simbolo = sc.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < cadena1.size(); i++) {
            if (cadena1.get(i) == simbolo) {
                contador++;
                //System.out.println("hola");
            }
        }

        System.out.println("Numero de Ocurrencias es: " + contador);

    }

    public void multiplicacionCadena() {
        String w1 = "";
        String w2 = "";
        System.out.println("Introduzca el valor de n: ");
        int valorn = sc.nextInt();
        if (valorn > 0) {
            for (int i = 0; i < cadena1.size(); i++) {
                w1 += cadena1.get(i);
            }
            for (int i = 0; i < cadena2.size(); i++) {
                w2 += cadena2.get(i);
            }
            for (int i = 0; i < valorn; i++) {
                System.out.print(w1 + w2 + " , ");
            }
        } else if (valorn == 0) {
            for (int i = 0; i < cadena1.size(); i++) {
                w1 += cadena1.get(i);
            }
            for (int i = 0; i < cadena2.size(); i++) {
                w2 += cadena2.get(i);
            }
            System.out.println(w1 + w1);
        } else if (valorn < 0) {
            for (int i = cadena1.size() - 1; i >= 0; i--) {
                w1 += cadena1.get(i);
            }
            for (int i = cadena2.size() - 1; i >= 0; i--) {
                w2 += cadena2.get(i);
            }
            for (int i = 0; i < Math.abs(valorn); i++) {
                System.out.print(w1 + w2 + " , ");
            }

        }

    }

    public void potenciaAlfabeto() {
//        int n = 0;
//        System.out.println("Introduce el valor de n:");
//        n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.print("[");
//            for (int j = 0; j < alfabeto1.size(); j++) {
//                for (int k = 0; k < alfabeto1.size(); k++) {
//                    System.out.print(alfabeto1.get(j) + "" + alfabeto1.get(k) + " , ");
//                }
//            }
//            System.out.print("]");
//            System.out.println();
//
//        }
        int n;
        System.out.println("Introduce el valor de n:");
        n = sc.nextInt();
        ArrayList<Character> aux = new ArrayList<Character>();
        for(int i=0; i<n;i++){
            for(int j=0;j<alfabeto1.size();j++){
                
            }
        }
        
    

    }
        public void ExpresionRegular(){
        
        System.out.println("Inserte una palabra que contengan las cinco vocales en orden.; ");
        String cadena = sc.next();
           if(cadena.matches("^(.*)[aA]+(.*)[eE]+(.*)[iI]+(.*)[oO]+(.*)[uU]+(.*)[aA]*(.*)[eE]*(.*)[iI]*(.*)[oO]*(.*)[uU]*(.*)$"))
           {
               System.out.println("Es Valida");
               
           }
           else
           {
               System.out.println("No es Valida");
           }
    }

    public void generarLenguaje() {
        System.out.println("");
        int x = 0, np, l;
        String cadena = "";
        System.out.println("Ingresa el número de palabras: ");
        np = sc.nextInt();
        System.out.println("Ingresa la longitud de las palabras: ");
        l = sc.nextInt();
        Random rand = new Random();
        //PARA EL LENGUAJE 1
        for (int i = 0; i < np; i++) {
            for (int j = 0; j < l; j++) {
                cadena+= alfabeto1.get(rand.nextInt(alfabeto1.size()));
            }
            Lenguaje1.add(cadena);
            cadena = "";
        }
        System.out.println("");
        cadena = "";
        //PARA EL LENGUAJE 2
        for (int i = 0; i < np; i++) {
            for (int j = 0; j < l; j++) {
                cadena+= alfabeto1.get(rand.nextInt(alfabeto1.size()));
            }
            Lenguaje2.add(cadena);
            cadena = "";
        }
        
        System.out.println("LENGUAJE L1");
        System.out.println(Lenguaje1);
        System.out.println("LENGUAJE L2");
        System.out.println(Lenguaje2);
        
    }
    public void unionLenguajes(){
        ArrayList<String> LenguajeU = new ArrayList<String>();
        ArrayList<String> LenguajeC = new ArrayList<String>();
        ArrayList<String> LenguajeR = new ArrayList<String>();
        ArrayList<String> LenguajeP = new ArrayList<String>();
        ArrayList<String> LenguajeI = new ArrayList<String>();
        String cadenaInvertida = "";
        String [] cadenas  = new String[Lenguaje1.size()];
        int n = 0;
        int tam;
        //UNION
        LenguajeU = (ArrayList)Lenguaje1.clone();
        LenguajeU.addAll(Lenguaje2);
        System.out.println("---------Union de L1 y L2  (L1UL2)-----------");
        System.out.println(LenguajeU);
        System.out.println("");
        //CONCATENACION
        for(int i =0;i<Lenguaje1.size();i++){
            for(int j =0;j<Lenguaje2.size();j++){
                LenguajeC.add(Lenguaje1.get(i).concat(Lenguaje2.get(j)));
            }
        }
        System.out.println("------Concatenacion de L1 y L2  (L1L2)-------");
        System.out.println(LenguajeC);
        System.out.println("");
        //RESTA
        LenguajeR = (ArrayList)Lenguaje1.clone();
         for(int i =0;i<Lenguaje1.size();i++){
            for(int j =0;j<Lenguaje2.size();j++){
                if(Lenguaje1.get(i).equals(Lenguaje2.get(j))){
                    LenguajeR.remove(Lenguaje1.get(i));
                }
            }
        }
        System.out.println("--------------Resta de L1-L2-----------------");
        System.out.println(LenguajeR);
        System.out.println("");
    }
    
    public void potenciaLenguaje(){
        ArrayList<String> LenguajeP = new ArrayList<String>();
        ArrayList<String> LenguajeI = new ArrayList<String>();
        String cadenaInvertida = "";
        int n = 0, opcion;
        System.out.println("POTENCIA\nQue lenguaje quieres usar: ");
        opcion = sc.nextInt();
        switch(opcion){
            case 1:          
            System.out.println("Ingresa la potencia n del lenguaje de -5/+5");
            n = sc.nextInt();
            LenguajeP = (ArrayList)Lenguaje1.clone();
            if(n<0){
                for(int j=0;j<Lenguaje1.size();j++){
                    for (int i = Lenguaje1.get(j).length()-1; i>=0; i--){
                        cadenaInvertida += Lenguaje1.get(j).charAt(i);
                    }
                    LenguajeI.add(cadenaInvertida);
                    cadenaInvertida="";
                }
                n = -n;
                LenguajeP = (ArrayList)LenguajeI.clone();
            }
            potencia("", (n+1));
            break;
            case 2:
            System.out.println("Ingresa la potencia n del lenguaje de -5/+5");
            n = sc.nextInt();
            LenguajeP = (ArrayList)Lenguaje2.clone();
            if(n<0){
                for(int j=0;j<Lenguaje2.size();j++){
                    for (int i = Lenguaje2.get(j).length()-1; i>=0; i--){
                        cadenaInvertida += Lenguaje2.get(j).charAt(i);
                    }
                    LenguajeI.add(cadenaInvertida);
                    cadenaInvertida="";
                }
                n = -n;
                LenguajeP = (ArrayList)LenguajeI.clone();
            }
            potencia2("", (n+1));
            break;
        }
        
    }
    public String potencia(String pal, Integer n){
        if(n==0){
            return "";
        }
        else if(n>1){
            for(String palabraL1 : Lenguaje1) {
                potencia(pal.concat(palabraL1), n-1);
            }
            return pal;
        }
        else{
            System.out.print(pal + ", ");
            return pal;
        }
    }
     public String potencia2(String pal, Integer n){
        if(n==0){
            return "";
        }
        else if(n>1){
            for(String palabraL1 : Lenguaje2) {
                potencia2(pal.concat(palabraL1), n-1);
            }
            return pal;
        }
        else{
            System.out.print(pal + ", ");
            return pal;
        }
    }
    public String concatenar(int n, ArrayList<String> L, int m, int aux){
        if (n==0){
            if(m==(L.size()-1)){
                return "";
            }else
                return "," +(concatenar(aux, L, m+1,aux));
        }    
        else
            return L.get(m) + (concatenar(n-1, L, m, aux));
    }
    public void curp(){
        persona per1 = new persona();
        System.out.println(per1);
        System.out.println("");
        System.out.print(per1.apellidoP.substring(0, 2).toUpperCase());
        System.out.print(per1.apellidoM.toUpperCase().charAt(0));
        System.out.print(per1.nombre.toUpperCase().charAt(0));
        System.out.print(per1.fecha);
        System.out.print(per1.sexo);
        System.out.print(per1.entidad);
        System.out.println(per1.cons.toUpperCase());
        
                
       // System.out.println(apellidosP[0].toUpperCase().charAt(1));
    }

    public void prefijo() {
        int cont=0, resultado;
        String palabra1 = "", palabra2 = "";
        for (int i = 0; i < cadena1.size(); i++) {
            palabra1 += cadena1.get(i);
        }
        for (int i = 0; i < cadena2.size(); i++) {
            palabra2 += cadena2.get(i);
        }
      //////////////////////////////////////
      resultado = palabra2.indexOf(palabra1);
      for(int i=0;i<palabra1.length();i++){
          for(int j=0;j<palabra2.length();j++){
              if(palabra1.charAt(i)==palabra2.charAt(j)){
                  cont++;
                  break;
              }
          }
      }
      System.out.println("");
      if(palabra2.startsWith(palabra1)){
        System.out.println("Es un prefijo");
      }else if(palabra2.endsWith(palabra1)){
          System.out.println("Es un sufijo ");
      }else if(resultado != -1){
          System.out.println("Es subcadena");
      }else if(cont==palabra1.length()){
          System.out.println("Es subsecuencia");
      }else System.out.println("NO es prefijo, sufijo, subcadena o subsecuencia");
    }
}
