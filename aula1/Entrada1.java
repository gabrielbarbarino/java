import java.util.Scanner;

public class Entrada1 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");

            String nome = teclado.next();
            System.out.print("Digite sua idade: ");
            int idade = teclado.nextInt();

            System.out.println("Seu nome é: " + nome + " sua idade: " + idade);
        }
    }
}
