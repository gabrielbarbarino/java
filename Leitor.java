package aula5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {
    public static void main(String[] args) throws FileNotFoundException {

        try{
            
        // FileReader para ler o arquivo
        FileReader leitor = new FileReader("aula5/arquivo.txt");
        // BufferedReader para melhorar a leitura
        BufferedReader bufferedReader = new BufferedReader(leitor);
        String linha;

        // While para indetificar o final do 
        while((linha = bufferedReader.readLine()) != null){
            System.out.println((linha));
        }
        
        bufferedReader.close();
        }catch(IOException e){
            System.out.println("Erro ao ler arquivo");
            e.printStackTrace();
        }
    }
}
