/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zazi1
 */
public class Main {
    
    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente = new CuentaCorriente("ES6256465847", 1000.0);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("ES9956415656", 3010.0);

        System.out.println("--- Mostramos datos de las cuentas ---");
        cuentaCorriente.mostrarDatos();
        cuentaAhorro.mostrarDatos();

        System.out.println("--- Ingresamos, retiramos y mostramos ---");
        cuentaCorriente.ingresar(1000.0);
        cuentaAhorro.retirar(500.0);
        cuentaCorriente.mostrarDatos();
        cuentaAhorro.mostrarDatos();

        System.out.println("--- Aplicamos intereses ---");
        cuentaCorriente.calcularIntereses();
        cuentaAhorro.calcularIntereses();
        cuentaCorriente.mostrarDatos();
        cuentaAhorro.mostrarDatos();
    }
}
    
