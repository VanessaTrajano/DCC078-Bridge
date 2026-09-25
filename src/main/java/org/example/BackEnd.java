package org.example;

public class BackEnd extends Programador{
    public BackEnd(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.senioridade.percentualAumento());
    }
}
