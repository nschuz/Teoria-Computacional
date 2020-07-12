package admin;

import java.util.Scanner;

public class automata1{

    private Scanner Entrada = new Scanner(System.in);
    private String cadena;
    private char[] caracter;
    private boolean aceptado;
    private int contador;

    public automata1(){
        contador = 0;
        System.out.println("Ingresa una cadena que acepte un número real");
        cadena = Entrada.nextLine();
        System.out.println("Cadena: " + cadena);
        caracter = cadena.toCharArray();
        q0(); //Iniciamos nuestro automata
        if (aceptado == true){
            System.out.println("La cadena es Válida");
        }
        else{
            System.out.println("Cadena no aceptada.");
        }
    }

    private boolean isNumber(char n) { return n >= 48 && n <= 57; }
    private boolean isSymbol(char s) { return s == '-' || s == '+'; }
    private boolean isExponencial(char e) { return e == 'e' || e == 'E'; }

    private void q0(){
        System.out.println("Q0");
        this.aceptado = false;
        if(contador<caracter.length){
            if(isNumber(caracter[contador])){ contador++; q2(); }
            else if(isSymbol(caracter[contador])){ contador++; q1(); }
        }
    }

    private void q1(){
        System.out.println("Q1");
        if(contador<caracter.length){
            aceptado = false;
            if(isNumber(caracter[contador])){ contador++; q2(); }
        }
    }

    private void q2() {
        System.out.println("Q2");
        if (contador < caracter.length) {
            aceptado = false;
            if (caracter[contador] == '.') { contador++; q3(); }
            else if(isNumber(caracter[contador])) { contador++; q2(); }
            else if (isExponencial(caracter[contador])) { contador++; q5(); }
        }
    }

    private void q3(){
        System.out.println("Q3");
        if(contador < caracter.length){
            aceptado = false;
            if(isNumber(caracter[contador])){ aceptado = true; contador++; q4(); }
        }
    }

    private void q4(){
        System.out.println("Q4");
        if(contador < caracter.length){
            aceptado = false;
            if(isNumber(caracter[contador])) { aceptado = true; contador++; q4(); }
            else if(isExponencial(caracter[contador])) { contador++; q5(); }
        }
    }

    private void q5(){
        System.out.println("Q5");
        if(contador < caracter.length){
            aceptado = false;
            if(isSymbol(caracter[contador])) { contador++; q6(); }
            else if(isNumber(caracter[contador])) { aceptado = true; contador++; q7(); }
        }
    }

    private void q6(){
        System.out.println("Q6");
        if(contador < caracter.length){
            aceptado = false;
            if(isNumber(caracter[contador])){ aceptado = true; contador++; q7(); }
        }
    }

    private void q7(){
        System.out.println("Q7");
        if(contador < caracter.length){
            aceptado = false;
            if(isNumber(caracter[contador])) { aceptado = true; contador++; q7(); }
        }
    }
}