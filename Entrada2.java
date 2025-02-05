import java.util.Scanner;

public class Entrada2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um Numero: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite o Segundo Numero: ");
            double n2 = sc.nextDouble();

            System.out.print("Digite o Terceiro Numero: ");
            double n3 = sc.nextDouble();

            double soma = n1 + n2;
            double sub = n1 - n2;
            double multi = n1 * n2;
            double div = n1 / n2;
            double media = ( n1 + n2 ) / 2;
            double media3 = ( n1 + n2 + n3) / 3;

            System.out.println("Soma: " + soma);
            System.out.println("Sub: " + sub);
            System.out.println("Multi: " + multi);
            System.out.println("Div: " + div);
            System.out.println("media: " + media);
            System.out.println("media3: " + media3);
        }

        
    }
}
