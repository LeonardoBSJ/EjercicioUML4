package Diagrama;

public class Hotel extends CuentaBancaria {

    public String nombre;
    public String direccion;
    public int Habitaciones;

    public Hotel(String nombre, int numeroCuenta, String nombreBanco) {
        super(numeroCuenta, nombreBanco);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHabitaciones() {
        return Habitaciones;
    }

    public void setHabitaciones(int Habitaciones) {
        this.Habitaciones = Habitaciones;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", Habitaciones=" + Habitaciones + '}';
    }

}
