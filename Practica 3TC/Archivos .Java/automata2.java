package admin;

import java.util.Scanner;


public class automata2 {

    private Scanner Entrada = new Scanner(System.in);
    private String cadena;
    private char[] caracter;
    private boolean aceptado;
    private int contador;

    public automata2(){
        contador = 0;
        System.out.println("Ingresa una cadena que contenga un número par de símbolos 0, y sin símbolos 1 sucesivos. ");
        this.cadena = Entrada.nextLine();
        this.caracter = this.cadena.toCharArray();
        q0(); //Iniciamos nuestro automata
        if (aceptado == true){
            System.out.println("La cadena es Válida");
        }
        else{
            System.out.println("Cadena no aceptada.");
        }
    }

    private boolean isZero(char z) { return z == '0'; }
    private boolean isOne(char o) { return o == '1'; }

    private void q0(){
        System.out.println("Q0");
        this.aceptado = false;
        if(contador<caracter.length){
            if(isZero(caracter[contador])) { contador++; q1(); }
            else if(isOne(caracter[contador])) { contador++; q3(); }
        }
    }

    private void q1(){
        System.out.println("Q1");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isZero(caracter[contador])) { aceptado = true; contador++; q2(); }
            else if(isOne(caracter[contador])) { contador++; q4(); }
        }
    }

    private void q2(){
        System.out.println("Q2");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isZero(caracter[contador])) { contador++; q1(); }
            else if(isOne(caracter[contador])) { aceptado = true; contador++; q5(); }
        }
    }

    private void q3(){
        System.out.println("Q3");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isZero(caracter[contador])) { contador++; q1(); }
        }
    }

    private void q4(){
        System.out.println("Q4");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isZero(caracter[contador])) { aceptado = true; contador++; q2(); }
        }
    }

    private void q5(){
        System.out.println("Q5");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isZero(caracter[contador])) { contador++; q1(); }
        }
    }

}