package org.example;

public class FrontEnd extends Programador{
    public FrontEnd(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.senioridade.percentualAumento());
    }
}
