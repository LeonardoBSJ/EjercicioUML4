
package Diagrama;

public class CuentaBancaria {
    public int numeroCuenta;
    public String nombreBanco;

    public CuentaBancaria(int numeroCuenta, String nombreBanco) {
        this.numeroCuenta = numeroCuenta;
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", nombreBanco=" + nombreBanco + '}';
    }
    
}
