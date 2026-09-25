package org.example;

public class FullStack extends Programador{
    public FullStack(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + (this.senioridade.percentualAumento() * 2));
    }
}
