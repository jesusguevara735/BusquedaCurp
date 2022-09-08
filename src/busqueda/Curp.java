package busqueda;
import java.util.Scanner;

public class Curp {
    public static void main (String[] args){
        //Metodo que recibe como argumento una CURP
        for (String s: args ){
        System.out.println("La Curp ingresada es: " + s);

            System.out.println(validarcurp(s));
        }
        //programa que recibe a traves de linea de comando una CURP
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte una CURP");
        String curp = leer.next();
        System.out.println("La URP ingresada es : " + curp);
        if(validarcurp(curp)){
            System.out.println("CURP valida");
        }else{
            System.out.println("CURP invalida");
        }

    }
    //Metodo para validar la sntaxis de una curp
        public static boolean validarcurp(String texto){
        return texto.matches("^[A-Z][A,E,I,O,U,X][A-Z]{2}[0-9]{2}[0-1][0-9][0-3][0-9][M,H][A-Z]{2}[B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z]{3}[0-9,A-Z][0-9]$");

        }
    }
