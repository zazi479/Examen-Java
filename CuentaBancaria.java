/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zazi1
 */
public abstract class CuentaBancaria {
    
    private String iban;
    private double saldo;
    double interesAnualBasico = 0.05;

    public CuentaBancaria() {
    }

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnualBasico() {
        return interesAnualBasico;
    }

    public void setInteresAnualBasico(double interesAnualBasico) {
        this.interesAnualBasico = interesAnualBasico;
    }
    
    
    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public void traspaso(CuentaBancaria cuentaDestino, double cantidad) {
        retirar(cantidad);
        cuentaDestino.ingresar(cantidad);
    }
    
     
    public void mostrarDatos() {
        System.out.println("Cuenta Bancaria IBAN: " + iban + " Saldo: " + saldo);
    }
}
    
    
    
    
    

