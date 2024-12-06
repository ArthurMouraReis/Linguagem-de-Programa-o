package ExerciciosSite02;

import java.util.Scanner;

public class Exe8 {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

        int ano1;
        int ano2;
        boolean resultado;

        System.out.print("Informe o ano 1: ");
        ano1 = Ler.nextInt();

        System.out.print("Informe o ano 2: ");
        ano2 = Ler.nextInt();


        resultado = (ano1 > ano2);

        System.out.println("O ano 1 é maior que o ano 2?  " + resultado);

        Ler.close();
    }
}
