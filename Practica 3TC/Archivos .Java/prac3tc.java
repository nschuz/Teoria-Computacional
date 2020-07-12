package admin;

import java.util.Scanner;

public class prac3tc {

    public static void main(String[] args) {
        int opcion;
        Scanner Entrada = new Scanner(System.in);
        do {
            automata1 aut1;
            automata2 aut2;
            automata3 aut3;
            automata4 aut4;
//         ---------   ___MENU___ ----------
            System.out.println("Practica 3 Teoria Computacional");
            System.out.println("");
            System.out.println("1.- Automata de numeros reales");
            System.out.println("2.- Automata de 0 pares y 1 no consecutivos");
            System.out.println("3.- Automata de cadenas con longitud 3");
            System.out.println("4.- Automata nuestro");
            opcion = Entrada.nextInt();
            switch (opcion) {
                case 1:
                    aut1 = new automata1();
                    break;
                case 2:
                    aut2 = new automata2();
                    break;
                case 3:
                    aut3 = new automata3();
                    break;
                case 4:
                    aut4 = new automata4();
                    aut4.setVisible(true);
                    break;
                default:
                    break;
            }
        } while (opcion >= 1 && opcion <= 4);
    }
}
