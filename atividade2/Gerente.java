package atividade2;

public class Gerente extends Funcionario{
    private Double bonus;

    public Gerente(String nome, String cargo, Double salario, Double bonus) {
        super(nome, cargo, salario);
        this.bonus = bonus;
    }


    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Double calcularBonus() {
        return super.getSalario()*bonus;
    }
}
