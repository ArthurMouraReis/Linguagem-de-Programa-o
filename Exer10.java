package ExerciciosSite02;



import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {

        String palavra1, palavra2;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite a primeira palavra:");
        palavra1 = scanner.nextLine();

        System.out.println("Digite a segunda palavra:");
        palavra2 = scanner.nextLine();


        boolean palavraMaior = palavra1.length() > palavra2.length();


        System.out.println("A primeira palavra tem mais letras do que a segunda? " + palavraMaior);


        scanner.close();
    }
}
