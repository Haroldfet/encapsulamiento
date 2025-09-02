package org.example;

public class Main {
    public static void main(String[] args) {
        CuentaBanco cuenta = new CuentaBanco();
        cuenta.depositar(500);
        cuenta.retirar(200);
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}