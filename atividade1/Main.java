package atividade1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produtinho = new Produto("camisa", 10.00,3);

        produtinho.setNome("camisa 2");
        produtinho.setPreco(12.00);
        produtinho.setQuantidade(5);

        System.out.println("produto e valor total = "+produtinho.calcularValorTotal(produtinho.getPreco(), produtinho.getQuantidade()));
    }
}