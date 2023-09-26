
package Diagrama;

public class EjercicioUML4 {

    public static void main(String[] args) {
        Hotel hotel = new Hotel("tlaloc", 1234,"Santander" );
        hotel.setDireccion("Carretera tex. KIL 20");
        hotel.setHabitaciones(89);
        
        CadenaHotelera cadena1 = new CadenaHotelera();
        cadena1.setNombre("hotel1");
        cadena1.setDirector("Alejandra");
        cadena1.agregarlistaHotelera(hotel);
        
        System.out.println("El nombre del hotel es: "+hotel.getNombre());
        System.out.println("el numero de cuenta del hotel es: "+hotel.getNumeroCuenta());
        System.out.println("El banco es:"+hotel.getNombreBanco());
        System.out.println("La direccion del hotel es: "+hotel.getDireccion());
        System.out.println("El director es: "+cadena1.getDirector());
        System.out.println("los datos de todo el hotel son: "+cadena1.toString());
    }
    
}
