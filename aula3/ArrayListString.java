import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListString {
    public static void main(String[] args) {
        // Serve para poder digitar, entrada de Dados
        Scanner scanner = new Scanner(System.in);

        // Criação do Array list para armazenar Strings
        ArrayList<String> lista = new ArrayList<>();

        for(int i = 0; i < 5; i++){

        System.out.println("Insira uma String: ");
        String entrada = scanner.nextLine();
        lista.add(entrada);

        }
        
         // Exibindo a lista 
        System.out.println("Elementos da lista:"); 
        for (String elemento: lista) { 
        System.out.println(elemento);

        // Fechando o Scanner 
        scanner.close();    
    }    

    }
}
