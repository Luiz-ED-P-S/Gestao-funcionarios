package org.example.empresa;
public class Gerente extends Funcionario {
    private double bonusMensal;

    public Gerente(String nome, String cpf, double salarioBase, double bonusMensal) {
        super(nome, cpf, salarioBase);
        this.bonusMensal = bonusMensal;
    }

    public double getBonusMensal() {
        return bonusMensal;
    }

    public void setBonusMensal(double bonusMensal) {
        this.bonusMensal = bonusMensal;
    }

    @Override
    public double calcularSalario() {

        return getSalarioBase() + this.bonusMensal;
    }
}