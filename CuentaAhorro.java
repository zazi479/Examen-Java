/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zazi1
 */
class CuentaAhorro extends CuentaBancaria {
    private final  double saldoMinimo = 3000.0;

    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    public void calcularIntereses() {
        if (getSaldo() < saldoMinimo) {
            setSaldo(getSaldo() + getSaldo() * (interesAnualBasico / 2));
        } else {
            setSaldo(getSaldo() + getSaldo() * (2 * interesAnualBasico));
        }
    }
}