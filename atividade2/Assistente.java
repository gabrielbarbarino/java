package atividade2;

public class Assistente extends Funcionario{

    public Assistente(String nome, String cargo, Double salario) {
        super(nome, cargo, salario);
    }

    public Double calcularBonus(){
        return super.getSalario()*5/100;

    }
}
