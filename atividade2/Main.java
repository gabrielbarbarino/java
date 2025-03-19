package atividade2;

public class Main {
    public static void main(String[] args) {
        Assistente as = new Assistente("Carlos", "Assistente geral", 2000.00);
        Gerente ger = new Gerente("fernando", "gerente", 3000.00, 1.1);

        System.out.println("Valor: "+as.calcularBonus());
        System.out.printf("Valor: %.2f",ger.calcularBonus());
    }
}
