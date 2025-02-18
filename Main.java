import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juanmanuel", 29));
        personas.add(new Persona("Fernanda", 25));
        personas.add(new Persona("Diego", 35));
        personas.add(new Persona("Lauraa", 31));
        personas.add(new Persona("Carlos", 26));
        personas.add(new Persona("Leonel", 34));
        personas.add(new Persona("Lorena", 24));
        personas.add(new Persona("Zara", 40));
        personas.add(new Persona("Maria", 35));
        personas.add(new Persona("Carlos", 32));

        // Ordenar por nombre usando Comparator
        Collections.sort(personas, new ComparadorPorNombre());

        //Collections.sort(personas, Comparator.comparing(p -> p.nombre)); // Ordena por nombre

        System.out.println(personas);
    }
}