package atividade4;

public class Geladeira extends Eletrodomesticos{
    private double capacidade;

    public Geladeira(String marca, double potencia, double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public void ligar(){
        System.out.println("Geladeira Ligando!");
    }
}
