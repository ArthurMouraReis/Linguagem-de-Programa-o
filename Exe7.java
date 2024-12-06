package ExerciciosSite02;

import java.util.Scanner;

public class Exe7 {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

        String var1;
        String var2;
        boolean resultado;

        System.out.print("Informe o texto 1: ");
        var1 = Ler.next();

        System.out.print("Informe o texto 2: ");
        var2 = Ler.next();


        resultado = (var1.length() < var2.length());

        System.out.println("O texto 1 é menor que o texto 2? " + resultado);

        Ler.close();
    }
}
