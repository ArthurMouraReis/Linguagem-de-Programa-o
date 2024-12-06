package Lista4CondicionaisSwitchCase;

import java.util.Scanner;

public class Exe5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 4 para indicar o quadrante: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Primeiro quadrante (x positivo, y positivo)");
                break;
            case 2:
                System.out.println("Segundo quadrante (x negativo, y positivo)");
                break;
            case 3:
                System.out.println("Terceiro quadrante (x negativo, y negativo)");
                break;
            case 4:
                System.out.println("Quarto quadrante (x positivo, y negativo)");
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }

        scanner.close();
    }
}
