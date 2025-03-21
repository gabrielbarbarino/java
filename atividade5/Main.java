package atividade5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Livro> livros = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int valor = 6;

        do {
            System.out.println("---------- Menu ----------");
            System.out.println("1 = Criar Livro e Adicionar a lista");
            System.out.println("2 = Exibir todos os livros cadastrados");
            System.out.println("3 = Alterar Algo do Livro");
            System.out.println("4 = Remover um livro pelo Titulo");
            System.out.println("5 = Sair");
            System.out.print("Opção:  ");
            valor = sc.nextInt();
            sc.nextLine();

            switch(valor){
                case 1:
                    adicionarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    alterarLivro();
                    break;
                case 4:
                    removerlivro();
                    break;
                case 5:
                    System.out.println("Saindo do Programa.....");
                    break;
                default:
                    System.out.println("Opção invalida!, Tente novamente.");
            }

        }while(valor != 5);

    }

    // Adiciona os livros, separando os dados em variaveis e criando um objeto para juntar os dados e colocar no array
    private static void adicionarLivro(){
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Ano Publicação: ");
        int anoPublicacao = sc.nextInt();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Livro l = new Livro(titulo, autor, anoPublicacao, preco);
        livros.add(l);
        System.out.println("Livro cadastrado com sucesso!");
    }

    // Metodo para listar livro, vai vê se existe, se existir vai rodar as informações q tem dentro do array

    private static void listarLivros(){
        if(livros.isEmpty()){
            System.out.println("Nenhum livro Cadastrado!");
        } else{
            for(Livro l : livros){
                l.exibirInformacoes();
            }
        }
    }

    private static void alterarLivro(){
        System.out.println("Digite o Titulo do livro q deseja alterar: ");
        String titulo = sc.nextLine();

        for(Livro l: livros){
            if(l.getTitulo().equals(titulo)){
                System.out.print("Livro Encontrado!, Oq deseja alterar?:  ");
                System.out.println("1 = Titulo");
                System.out.println("2 = Autor");
                System.out.println("3 = Ano");
                System.out.println("4 = Preço");
                int escolha = sc.nextInt();
                sc.nextLine();

                switch (escolha){
                    case 1:
                        System.out.print("Novo Titulo: ");
                        l.setTitulo(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Novo Autor: ");
                        l.setAutor(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Novo Ano: ");
                        l.setAnoPublicacao(sc.nextInt());
                        break;
                    case 4:
                        System.out.print("Novo Preço: ");
                        l.setPreco(sc.nextDouble());
                        break;
                        default:
                            System.out.println("Opção invalida!, Tente novamente.");


                }

                System.out.println("Informações do livro alteradas com sucesso!");
                return;
            }
        }
        System.out.println("Nenhum livro Encontrado!");
    }

    private static void removerlivro(){
        System.out.print("Digite o titulo do livro q deseja remover:  ");
        String titulo = sc.nextLine();

        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(i);
                System.out.println("Livro removido com sucesso!");
                return;
            }
        }
        System.out.println("Nenhum livro Removido com sucesso!");
    }
}
