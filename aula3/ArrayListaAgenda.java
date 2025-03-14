import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListaAgenda {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> numeros = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int contatos = 0;

        System.out.print("Quantos contatos vc deseja adicionar?: ");
        contatos = teclado.nextInt();
        System.out.println("------------------------------------------------------------------------");
        for(int i = 0; i < contatos; i++){

        System.out.print("Digite o nome para esse contato: ");
        String nome = teclado.next();
        nomes.add(nome);

        System.out.print("Digite o numero do contato: ");
        String numero = teclado.next();
        numeros.add(numero);
        }


        System.out.println("------------------------------------------------------------------------");
        for(int i = 0; i < contatos; i++){
            System.out.println("contato = " +nomes.get(i)+ " | Numero: " + numeros.get(i));
        }

    
        teclado.close();
    }
}
