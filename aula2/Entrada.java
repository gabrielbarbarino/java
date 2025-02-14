import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos nomes vc deseja inserir?: ");
        int tamanho = teclado.nextInt();
        teclado.nextLine();

        System.out.println("----------------------------------------------------");

        String[] nome = new String[tamanho];

        for(int i = 0; i < nome.length; i++){
            System.out.print("Digite o Nome " + (i + 1) + "º: ");
            nome[i] = teclado.nextLine();
        }

        System.out.println("----------------------------------------------------");

        for(int i = 0; i < nome.length; i++){
            System.out.println("Nomes = "+ nome[i]);
        }

        teclado.close();
    }
}
