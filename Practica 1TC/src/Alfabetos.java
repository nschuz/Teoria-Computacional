import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Alfabetos {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Character> alfabeto1;
    static ArrayList<Character> alfabeto2;
    static ArrayList<Character> cadena1;
    static ArrayList<Character> cadena2;

    public static void main(String[] args) {
        int opcion=0;
        Alfabetos miobjeto = new Alfabetos();
        Alfabetos miobjeto2 = new Alfabetos();
        miobjeto.alfabeto1 = new ArrayList<Character>();
        miobjeto2.alfabeto2 = new ArrayList<Character>();
        miobjeto.cadena1 = new ArrayList<Character>();
        miobjeto.cadena2 = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        miobjeto.Opcion();
        miobjeto.OpcionDos();
        miobjeto.mostarAlafabeto();
        miobjeto.mostarAlafabetoDos();
        miobjeto.insertarCadena();
        do {
        System.out.println("\n------Recuerde sus alafabetos son:------");
        miobjeto.mostarAlafabeto();
        miobjeto.mostarAlafabetoDos();

        System.out.println("\n\nIntroduce la opcion deseada: ");
        System.out.println("1. Generar: (w1w2) n, donde n es un entero (positivo o negativo) y es un valor de entrada.");
        System.out.println("2. Obtener: |w1|x, donde x ԑ∑1, y x es un valor de entrada: ");
        System.out.println("3. Indicar si w1 es un prefijo o sufijo (propio o no propio), o subcadena, o subsecuencia, o cualquier combinación anterior, de w2.");
        System.out.println("4. Leer la palabra w3 y desplegar en pantalla si esta cadena es o no es un palíndromo.");
        System.out.println("5. Generar (desplegar en pantalla): ∑ n, donde n es un entero (mayor que cero) y es un valor de entrada.");
        System.out.println("6. Generar 3 palabras válidas de forma aleatoria de ∑1 o de ∑");

          opcion= sc.nextInt();

        switch (opcion){
            case 1:
                System.out.println("1. Generar: (w1w2) n, donde n es un entero (positivo o negativo) y es un valor de entrada.");
                miobjeto.multiplicacionCadena();
                break;
            case 2:
                System.out.println("2. Obtener: |w1|x, donde x ԑ∑1, y x es un valor de entrada: ");
                miobjeto.NumeroDeOcurrenciasSimbolo();
                break;


            case 3:
                System.out.println("3. Indicar si w1 es un prefijo o sufijo (propio o no propio), o subcadena, o subsecuencia, o cualquier combinación anterior, de w2.");
                miobjeto.prefijo();
                break;

            case 4:
                System.out.println("4. Leer la palabra w3 y desplegar en pantalla si esta cadena es o no es un palíndromo.");
                miobjeto.palindromo();
                break;

            case 5:
                System.out.println("5. Generar (desplegar en pantalla): ∑ n, donde n es un entero (mayor que cero) y es un valor de entrada.");
                miobjeto.potenciaAlfabeto();
                break;

            case  6:
                System.out.println("6. Generar 3 palabras válidas de forma aleatoria de ∑1 o de ∑");
                miobjeto.palabraRandom();
                miobjeto.palabraRandom();
                miobjeto.palabraRandom();
                break;



            default:
                throw new IllegalStateException("Unexpected value: " + opcion);
        }
        }while (opcion<7);

    }

    public void Opcion() {
        Scanner sc = new Scanner(System.in);
        int opcionn;

        System.out.printf("---Alfabeto 1---");
        System.out.println("Inserte: \n 1.para insertar caracater \n 2.Insertar un rango");
        opcionn = sc.nextInt();
        if (opcionn == 1)

            ingresarValor();
        else {
            ingesaRango();
        }


    }

    public void OpcionDos() {
        Scanner sc = new Scanner(System.in);
        int opcionn;
        System.out.println("---Alfabeto 2---");
        System.out.println("Inserte: \n 1.para insertar caracater \n 2.Insertar un rango");
        opcionn = sc.nextInt();
        if (opcionn == 1)
            ingresarValorDos();
        else {
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
                contador=1;
            }

        } while (bandera==true);
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
                contador=1;
            }

        } while (bandera==true);

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
            int contador=0;
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
           System.out.println("contador: "+contador+" cadenauno: "+cadenauno.length());
            if (contador==cadenauno.length()){
                bandera=true;
            }else{
                bandera=false;
            }
        } while (bandera == false);

        bandera=false;
        do {
            cadena2.clear();
          int  condor2=0;
            System.out.println("Cadena2 --Introduce una cadena 'w' dentro de alfabeto 1");
            cadenados = sc.next();
            System.out.println(cadenados);
            for (int i = 0; i < cadenados.length(); i++) {
                caracter = cadenados.charAt(i);
                cadena2.add(caracter);
                for (int j = 0; j < alfabeto1.size(); j++) {
                    if (cadena2.get(i).equals(alfabeto1.get(j))) {
                        bandera = true;
                        //  System.out.println("good");
                        condor2++;
                    }

                }

            }
            System.out.println("contador: "+condor2+" cadenados: "+cadenados.length());
            if (condor2==cadenados.length()){
                bandera=true;
            }else{
                bandera=false;
            }
        } while (bandera == false);


    }

    public void palindromo (){
        Scanner entrada = new Scanner(System.in);
        int pos=0;
        StringBuffer frase, inversa;
        String s1, s2;
        System.out.println("Introduzca una frase. Este programa comprobará si se trata o no de un palíndromo.");
        frase = new StringBuffer(entrada.nextLine());
        while (pos < frase.length()) //si utilizamos for, dejamos la parte de pos++ vacía
            if (!Character.isLetter(frase.charAt(pos)))
                frase.deleteCharAt(pos);
            else
                pos++;
        inversa = new StringBuffer(frase);
        inversa.reverse();
        s1 = frase.toString();
        s2 = inversa.toString();
        if (s1.equalsIgnoreCase(s2)) //ignora si hay mayusculas o minisculas
            System.out.println("La frase introducida es un palíndromo.");
        else
            System.out.println("La frase introducida no es un palíndromo.");

    }

    public void NumeroDeOcurrenciasSimbolo(){
        System.out.println("Introduzca el simbolo a contar: ");
        char simbolo = sc.next().charAt(0);
        int contador=0;
        for (int i = 0; i<cadena1.size(); i++) {
             if (cadena1.get(i)==simbolo){
                 contador++;
                 //System.out.println("hola");
             }
        }

        System.out.println("Numero de Ocurrencias es: "+contador);

    }

    public void multiplicacionCadena(){
        String w1="";
        String w2="";
        System.out.println("Introduzca el valor de n: ");
        int valorn= sc.nextInt();
        if ( valorn>0){
            for (int i = 0; i <cadena1.size() ; i++) {
                w1+=cadena1.get(i);
            }
            for (int i = 0; i <cadena2.size() ; i++) {
                w2+=cadena2.get(i);
            }
            for (int i =0; i <valorn ; i++) {
                System.out.print(w1+w2+" , ");
            }
        }
        else if (valorn==0){
            for (int i = 0; i <cadena1.size() ; i++) {
                w1+=cadena1.get(i);
            }
            for (int i = 0; i <cadena2.size() ; i++) {
                w2+=cadena2.get(i);
            }
            System.out.println(w1+w1);
        }
        else if (valorn<0){
            for (int i = cadena1.size()-1; i>=0 ; i--) {
                w1+=cadena1.get(i);
            }
            for (int i =cadena2.size()-1; i>=0 ; i--) {
                w2+=cadena2.get(i);
            }
            for (int i =0; i <Math.abs(valorn) ; i++) {
                System.out.print(w1+w2+" , ");
            }

        }


    }

    public void  potenciaAlfabeto(){
        int n=0;
        System.out.println("Introduce el valor de n:");
        n=sc.nextInt();

        switch (n){
            case 1:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                        System.out.print(alfabeto1.get(i) + "" + " , ");
                }
                System.out.print("[");
                break;

            case 2:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                            for (int k = 0; k < alfabeto1.size(); k++) {
                        System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + " , ");
                    }

                }
                System.out.print("]");
                break;

            case 3:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                    for (int k = 0; k < alfabeto1.size(); k++) {
                        for (int j = 0; j <alfabeto1.size() ; j++) {
                            System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + ""+ alfabeto1.get(j)+" , ");
                        }
                    }

                }
                System.out.print("]");
                break;

            case 4:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                    for (int k = 0; k < alfabeto1.size(); k++) {
                        for (int j = 0; j <alfabeto1.size() ; j++) {
                            for (int l = 0; l <alfabeto1.size() ; l++) {
                                System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + ""+ alfabeto1.get(j)+""+alfabeto1.get(l)+" , ");
                            }
                        }
                    }

                }
                System.out.print("]");
                break;

            case 5:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                    for (int k = 0; k < alfabeto1.size(); k++) {
                        for (int j = 0; j <alfabeto1.size() ; j++) {
                            for (int l = 0; l <alfabeto1.size() ; l++) {
                                for (int m = 0; m <alfabeto1.size() ; m++) {
                                    System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + ""+ alfabeto1.get(j)+""+alfabeto1.get(l)
                                            +""+alfabeto1.get(m)+" , ");
                                }
                            }
                        }
                    }

                }
                System.out.print("]");
                break;

            case 6:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                    for (int k = 0; k < alfabeto1.size(); k++) {
                        for (int j = 0; j <alfabeto1.size() ; j++) {
                            for (int l = 0; l <alfabeto1.size() ; l++) {
                                for (int m = 0; m <alfabeto1.size() ; m++) {
                                    for (int o = 0; o <alfabeto1.size() ; o++) {
                                        System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + ""+ alfabeto1.get(j)+""+alfabeto1.get(l)
                                                +""+alfabeto1.get(m)+""+alfabeto1.get(o)+" , ");
                                    }
                                }
                            }
                        }
                    }

                }
                System.out.print("]");
            case 7:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                    for (int k = 0; k < alfabeto1.size(); k++) {
                        for (int j = 0; j <alfabeto1.size() ; j++) {
                            for (int l = 0; l <alfabeto1.size() ; l++) {
                                for (int m = 0; m <alfabeto1.size() ; m++) {
                                    for (int o = 0; o <alfabeto1.size() ; o++) {
                                        for (int p = 0; p <alfabeto1.size() ; p++) {
                                            System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + ""+ alfabeto1.get(j)+""+alfabeto1.get(l)
                                                    +""+alfabeto1.get(m)+""+alfabeto1.get(o)+""+alfabeto1.get(p)+" , ");
                                        }

                                    }
                                }
                            }
                        }
                    }

                }
                System.out.print("]");
                break;

            case  8:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                    for (int k = 0; k < alfabeto1.size(); k++) {
                        for (int j = 0; j <alfabeto1.size() ; j++) {
                            for (int l = 0; l <alfabeto1.size() ; l++) {
                                for (int m = 0; m <alfabeto1.size() ; m++) {
                                    for (int o = 0; o <alfabeto1.size() ; o++) {
                                        for (int p = 0; p <alfabeto1.size() ; p++) {
                                            for (int q = 0; q <alfabeto1.size() ; q++) {
                                                System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + ""+ alfabeto1.get(j)+""+alfabeto1.get(l)
                                                        +""+alfabeto1.get(m)+""+alfabeto1.get(o)+""+alfabeto1.get(p)+""+alfabeto1.get(q)+" , ");
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }

                }
                System.out.print("]");
                break;


            case 9:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                    for (int k = 0; k < alfabeto1.size(); k++) {
                        for (int j = 0; j <alfabeto1.size() ; j++) {
                            for (int l = 0; l <alfabeto1.size() ; l++) {
                                for (int m = 0; m <alfabeto1.size() ; m++) {
                                    for (int o = 0; o <alfabeto1.size() ; o++) {
                                        for (int p = 0; p <alfabeto1.size() ; p++) {
                                            for (int q = 0; q <alfabeto1.size() ; q++) {
                                                for (int r = 0; r <alfabeto1.size() ; r++) {
                                                    System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + ""+ alfabeto1.get(j)+""+alfabeto1.get(l)
                                                            +""+alfabeto1.get(m)+""+alfabeto1.get(o)+""+alfabeto1.get(p)+
                                                            ""+alfabeto1.get(q)+ ""+alfabeto1.get(r)+" , ");
                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }

                }
                System.out.print("]");
            break;

            case 10:
                System.out.print("[");
                for (int i = 0; i <alfabeto1.size(); i++) {
                    for (int k = 0; k < alfabeto1.size(); k++) {
                        for (int j = 0; j <alfabeto1.size() ; j++) {
                            for (int l = 0; l <alfabeto1.size() ; l++) {
                                for (int m = 0; m <alfabeto1.size() ; m++) {
                                    for (int o = 0; o <alfabeto1.size() ; o++) {
                                        for (int p = 0; p <alfabeto1.size() ; p++) {
                                            for (int q = 0; q <alfabeto1.size() ; q++) {
                                                for (int r = 0; r <alfabeto1.size() ; r++) {
                                                    for (int s = 0; s <alfabeto1.size() ; s++) {
                                                        System.out.print(alfabeto1.get(i) + "" + alfabeto1.get(k) + ""+ alfabeto1.get(j)+""+alfabeto1.get(l)
                                                                +""+alfabeto1.get(m)+""+alfabeto1.get(o)+""+alfabeto1.get(p)+
                                                                ""+alfabeto1.get(q)+ ""+alfabeto1.get(r)+""+alfabeto1.get(s)+" , ");
                                                    }
                                                }
                                            }
                                        }

                                    }
                                }
                            }
                        }
                    }

                }
                System.out.print("]");
                break;

        }






    }

    public void palabraRandom (){
        String palabra="";
        int  hasta=(int)(Math.random()*8+3), contador=0;

        for (int i = 0; i <alfabeto1.size() ; i++) {
            int random=(int)(Math.random()*alfabeto1.size()+1);
            palabra+=alfabeto1.get(random);
            contador++;
            if (hasta==contador)
                break;

        }
        System.out.println("La palabra random es: "+palabra);
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


