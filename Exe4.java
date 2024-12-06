package Lista4CondicionaisSwitchCase;

import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as três notas do aluno (de 0 a 10):");

        double nota1 = obterNotaValida(scanner, 1);
        double nota2 = obterNotaValida(scanner, 2);
        double nota3 = obterNotaValida(scanner, 3);


        double media = (nota1 + nota2 + nota3) / 3;


        System.out.printf("Média: %.2f\n", media);
        switch (determineSituacao(media)) {
            case "Aprovado":
                System.out.println("Situação: Aprovado");
                break;
            case "Em recuperação":
                System.out.println("Situação: Em recuperação");
                break;
            case "Reprovado":
                System.out.println("Situação: Reprovado");
                break;
        }

        scanner.close();
    }


    private static double obterNotaValida(Scanner scanner, int numeroNota) {
        double nota;
        do {
            System.out.printf("Nota %d: ", numeroNota);
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }


    private static String determineSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Em recuperação";
        } else {
            return "Reprovado";
        }
    }
}
