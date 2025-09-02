package org.example;
public class CuentaBanco {
    private double saldo;

    public void depositar(double dinero) {
        if (dinero > 0) {
            saldo += dinero;
        }
    }
    public void retirar(double dinero) {
        if (dinero > 0 && dinero <= saldo) {
            saldo -= dinero;
        }
    }
    public double getSaldo() {
        return saldo;
    }
}
