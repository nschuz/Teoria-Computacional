package admin;

import java.util.Scanner;

public class automata3 {

    private Scanner Entrada = new Scanner(System.in);
    private String cadena;
    private char[] caracter;
    private boolean aceptado;
    private int contador;

    public automata3(){
        contador = 0;
        System.out.println("Ingresa una cadena que contenga de longitud tres tales que contengan dos o tres símbolos consecutivos iguales, para el alfabeto {a,b,c}. ");
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
    private boolean isA(char a) { return a == 'a'; }
    private boolean isB(char b) { return b == 'b'; }
    private boolean isC(char c) { return c == 'c'; }

    private void q0(){
        System.out.println("Q0");
        this.aceptado = false;
        if(contador<caracter.length){
            if(isA(caracter[contador])) { contador++; q1(); }
            else if(isB(caracter[contador])) { contador++; q6(); }
            else if(isC(caracter[contador])) { contador++; q7(); }
        }
    }

    private void q1(){
        System.out.println("Q1");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isA(caracter[contador])) { contador++; q2(); }
            else if(isB(caracter[contador])) { contador++; q3(); }
            else if(isC(caracter[contador])) { contador++; q4(); }
        }
    }
    private void q2(){
        System.out.println("Q2");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isA(caracter[contador])) { aceptado = true; contador++; q5(); }
            else if(isB(caracter[contador])) { aceptado = true; contador++; q5(); }
            else if(isC(caracter[contador])) { aceptado = true; contador++; q5(); }
        }
    }
    private void q3(){
        System.out.println("Q3");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isB(caracter[contador])) { aceptado = true; contador++; q5(); }
        }
    }
    private void q4(){
        System.out.println("Q4");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isC(caracter[contador])) { aceptado = true; contador++; q5(); }
        }
    }
    private void q5(){
        System.out.println("Q5");
        if(contador<caracter.length){
            this.aceptado = false;
        }
    }
    private void q6(){
        System.out.println("Q6");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isA(caracter[contador])) { contador++; q8(); }
            else if(isB(caracter[contador])) { contador++; q2(); }
            else if(isC(caracter[contador])) { contador++; q4(); }
        }
    }
    private void q7(){
        System.out.println("Q7");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isA(caracter[contador])) { contador++; q8(); }
            else if(isB(caracter[contador])) { contador++; q3(); }
            else if(isC(caracter[contador])) { contador++; q2(); }
        }
    }
    private void q8(){
        System.out.println("Q8");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isA(caracter[contador])) {aceptado = true; contador++; q5(); }
        }
    }
    private void q9(){
        System.out.println("Q9");
        if(contador<caracter.length){
            this.aceptado = false;
        }
    }
    private void q10(){
        System.out.println("Q10");
        if(contador<caracter.length){
            this.aceptado = false;
            if(isA(caracter[contador])) { contador++; q8(); }
            else if(isB(caracter[contador])) { contador++; q3(); }
            else if(isC(caracter[contador])) { contador++; q4(); }
        }
    }
}