/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zazi1
 */
public class CuentaCorriente extends CuentaBancaria{
    
     public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    public void calcularIntereses() {
        setSaldo(getSaldo() + getSaldo() * interesAnualBasico);
    }
    
}
