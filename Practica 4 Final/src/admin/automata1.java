package admin;

import java.util.ArrayList;
import java.util.Arrays;

public class automata1 {
    String estado;
    String clase;
    String tr1;
    String tr2;
    String clase1;
    String clase2;
    String eq;

    public automata1(String estado, String clase, String tr1, String clase1, String tr2, String clase2) {
        this.estado = estado;
        this.clase = clase;
        this.tr1 = tr1;
        this.tr2 = tr2;
        this.clase1 = clase1;
        this.clase2 = clase2;
    }
     public automata1(automata1 estadox) {
        this.estado = estadox.estado;
        this.clase = estadox.clase;
        this.tr1 = estadox.tr1;
        this.tr2 = estadox.tr2;
        this.clase1 = estadox.clase1;
        this.clase2 = estadox.clase2;
    }
    public automata1(automata1 est, automata1 eq1, int cont) {
        this.estado = est.estado;
        this.clase = "c"+cont;
        if(eq1.estado.equals(est.tr1)){
            this.tr1 = est.estado;
            this.clase1 = "c"+cont;
        }else{
            this.tr1 = est.tr1;
            clase1= eq1.clase;
        }
        if(eq1.estado.equals(est.tr2)){
            this.tr2 = est.estado;
            this.clase2 = ""+cont;
        }else{
            this.tr2 = est.tr2;
            clase1= eq1.clase;
        }
        this.clase1 = est.clase1;
        this.clase2 = est.clase2;
        this.eq = eq1.estado;
    }
    
    public String toString(){
        return estado +" "+ clase +" "+ tr1 +" "+ clase1 +" "+ tr2 +" "+ clase2;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getTr1() {
        return tr1;
    }

    public void setTr1(String tr1) {
        this.tr1 = tr1;
    }

    public String getTr2() {
        return tr2;
    }

    public void setTr2(String tr2) {
        this.tr2 = tr2;
    }

    public String getClase1() {
        return clase1;
    }

    public void setClase1(String clase1) {
        this.clase1 = clase1;
    }

    public String getClase2() {
        return clase2;
    }

    public void setClase2(String clase2) {
        this.clase2 = clase2;
    }

    

   
}
