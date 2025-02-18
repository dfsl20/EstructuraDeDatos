import java.util.*;

class ComparadorPorNombre implements Comparator<Persona> {
    
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.nombre.compareTo(p2.nombre); // Ordena por nombre alfabéticamente
        Collections.sort(personas, Comparator.comparing(p -> p.nombre)); // Ordena por nombre
    }
}