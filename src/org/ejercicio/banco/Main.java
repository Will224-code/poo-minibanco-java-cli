package org.ejercicio.banco;

public class Main{
    public static void main(String[] args) {
        Cliente clientel = new Cliente("Luis Gomez", 25672946);
        CuentaBancaria cuental = new CuentaBancaria(693531,clientel,10000);

        CuentaBancaria cuenta2 = new CuentaBancaria(693531, new Cliente("Luis Gomi", 25672946)  ,10000);

        new Cliente("Madre", 2446);
    }
}