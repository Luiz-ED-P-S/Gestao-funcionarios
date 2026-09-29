package org.example.empresa;
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("\n--- Resumo da Folha de Pagamento ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.printf("Salário Base: R$ %.2f\n", salarioBase);
        System.out.printf("Salário Final: R$ %.2f\n", calcularSalario());
        System.out.println("------------------------------------");
    }
}