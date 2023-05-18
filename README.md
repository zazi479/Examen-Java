# Examen-Java

#Programación orientada a objetos con Java

Implementa una aplicación que simule el funcionamiento de un banco según los requisitos siguientes.

Crea una clase CuentaBancaria con los atributos: iban y saldo. Implementa métodos para:
  • Consultar los atributos.
  • Ingresar dinero.
  • Retirar dinero.
  • Traspasar dinero de una cuenta a otra.
En relación a los tres últimos,debe existir un método más que añada una cantidad (positiva o negativa) al saldo. Fíjate en el diagrama UML del final.
Además habrá un atributo común a todas las instancias llamado interesAnualBasico, que debe ser constante.
La clase tiene debe ser abstracta y debe contener un método llamado
calcularIntereses(). También se debe implementar un método para mostrar los datos de la cuenta.
De esta clase heredarán dos subclases: CuentaCorriente y CuentaAhorro.
La diferencia entre ambas será la manera de calcular los intereses:

  • A la primera se le incrementará el saldo teniendo en cuenta el interés anual básico.
  • La segunda tendrá una constante de clase llamada saldoMinimo. Si no se llega a este saldo el interés será la mitad del interés básico.
  
  Si se supera el saldo mínimo el interés aplicado será el doble del interés anual básico. Implementa, finalmente, una clase principal con función main para probar el funcionamiento de las tres clases: crea varias cuentas bancarias de distintos tipos, realiza ingresos, retiradas y transferencias; calcula los intereses tal y

como ves en la siguiente salida por pantalla:
--- Mostramos datos de las cuentas ---
Cuenta Corriente IBAN: ES6256465847 Saldo: 1000.0
Cuenta Ahorro IBAN: ES9956415656 Saldo: 3010.0
--- Ingresamos, retiramos y mostramos ---
Cuenta Corriente IBAN: ES6256465847 Saldo: 2000.0
Cuenta Ahorro IBAN: ES9956415656 Saldo: 2510.0
--- Aplicamos intereses ---
Cuenta Corriente IBAN: ES6256465847 Saldo: 1025.0
Cuenta Ahorro IBAN: ES9956415656 Saldo: 3685.5

El diagrama UML es este:
