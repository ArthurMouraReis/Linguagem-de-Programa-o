package Lista4CondicionaisSwitchCase;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        switch (Character.toLowerCase(letra)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("A letra é uma vogal.");
                break;
            default:
                if (Character.isLetter(letra)) {
                    System.out.println("A letra é uma consoante.");
                } else {
                    System.out.println("Caractere inválido. Por favor, digite uma letra.");
                }
                break;
        }

        scanner.close();
    }
}
