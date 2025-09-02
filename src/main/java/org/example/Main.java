package org.example;

public class Main {
    public static void main(String[] args) {
        CuentaBanco cuenta = new CuentaBanco();
        cuenta.depositar(100);
        cuenta.retirar(70);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}