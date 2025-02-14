import java.util.Scanner;

public class VetorSoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        System.out.println("--------------------------------------------");
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite o numero: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.println("--------------------------------------------");
        System.out.println("A soma dos elemtos do array é = " + soma);
        sc.close();
    }
}
