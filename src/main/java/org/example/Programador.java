package org.example;

public abstract class Programador {
    protected Senioridade senioridade;

    protected float salarioBase;

    public Programador(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setSenioridade(Senioridade senioridade) {
        this.senioridade = senioridade;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
