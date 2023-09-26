package Diagrama;
import java.util.ArrayList;
public class CadenaHotelera {
    public String nombre;
    public String Director;
    public ArrayList<Hotel>listaHotelera = new ArrayList<>();
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }
    public void agregarlistaHotelera(Hotel hotel){
        listaHotelera.add(hotel);
    }

    @Override
    public String toString() {
        return "CadenaHotelera{" + "nombre=" + nombre + ", Director=" + Director + ", listaHotelera=" + listaHotelera + '}';
    }
    
}
