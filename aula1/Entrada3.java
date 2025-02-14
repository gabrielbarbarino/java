import java.util.Scanner;

public class Entrada3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite uma Palavra: ");
            String palavra = teclado.next();

            System.out.print("Digite uma Palavra: ");
            String palavra2 = teclado.next();

            System.out.println("A junção das suas palavras foram: " + palavra +  " "  + palavra2);
        }
    }
}
