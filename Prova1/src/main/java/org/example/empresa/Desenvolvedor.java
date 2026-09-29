package org.example.empresa;
public class Desenvolvedor extends Funcionario {
    private String nivel;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String nivel) {
        super(nome, cpf, salarioBase);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {

        if (this.nivel != null && this.nivel.equalsIgnoreCase("SENIOR")) {
            return getSalarioBase() * 1.30;
        }
        return getSalarioBase();
    }
}