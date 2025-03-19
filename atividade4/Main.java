package atividade4;

public class Main {
    public static void main(String[] args) {
        Geladeira ge = new Geladeira("Eletrolux", 500, 12);
        ge.ligar();

        Microondas mi = new Microondas("Eletrolux", 500, 12);
        mi.ligar();
    }
}
