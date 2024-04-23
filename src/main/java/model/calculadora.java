
package model;

public class calculadora {
    private double valorA;
    private double valorB;
    private double operation;

    public calculadora() {
        this(0, 0, 0);
    }
    
    public calculadora(double valorA, double valorB, double operation) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.operation = operation;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double getOperation() {
        return operation;
    }

    public void setOperation(double operation) {
        this.operation = operation;
    }
    
    public double getSoma(){
        return (getValorA() + getValorB());
    }
    
    public double getQuociente(){
        return (getValorA() / getValorB());
    }
    
    public double getProduto(){
        return (getValorA() * getValorB());
    }
    
    public double getDiferenca(){
        return (getValorA() - getValorB());
    }
    
}
