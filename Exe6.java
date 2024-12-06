package ExerciciosSite02;

import java.util.Scanner;

public class Exe6 {

    public static void main(String[] args) {

        Scanner Ler = new Scanner(System.in);

        char var1;
        char var2;
        boolean resultado;

        System.out.print("Informe a var 1 : ");
        var1 = Ler.next().charAt(0);

        System.out.print("Informe a var 2: ");
        var2 = Ler.next().charAt(0);


        resultado = (var1 > var2);

        System.out.println("A var 1 é igual a var 2? " + resultado);

        Ler.close();
    }
}