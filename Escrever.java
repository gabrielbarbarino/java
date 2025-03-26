package aula5;

import java.io.FileWriter;
import java.io.IOException;

public class Escrever {
    public static void main(String[] args) throws IOException {
        
        try{

            // Ultilizamos o objeto para escrever no arquivo.txt // Criação do arquivo
            FileWriter escritor = new FileWriter("aula5/arquivo.txt");

            // Escrevendo no arquivo
            escritor.write("Olá, este é um arquivo de teste \n");
            escritor.write("Podemos escrever varias linhas\n");
       
            // Fechando para ser salvado os dados
            escritor.close();

            // Msg de erro
            System.out.println("Arquivo criado com sucesso!");

        }catch(IOException e){
            System.out.println("Ocorreu um erro ao criar o arquivo!");
            e.printStackTrace();
        }
       
                    

    }   
}
    