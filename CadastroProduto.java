package aula5;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CadastroProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            FileWriter escritor = new FileWriter("aula5/produtos.txt", true);

            System.out.println("Digite o nome do produto: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço do produto: ");
            double preco = scanner.nextDouble();

            escritor.write(nome + " - R$ "+ preco + "\n");
            escritor.close();

            System.out.println("produto cadastrado com sucesso!");
        } catch(IOException e){
            System.out.println("Erro ao salvar o produto!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
    
}
