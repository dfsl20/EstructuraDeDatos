import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad); // Ordenar por edad
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}

public class MainDosA {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Lauraa", 31));
        personas.add(new Persona("Carlos", 26));
        personas.add(new Persona("Leonel", 34));
        personas.add(new Persona("Lorena", 24));
        personas.add(new Persona("Zara", 40));
        personas.add(new Persona("Maria", 35));

        Collections.sort(personas); // Ordena usando compareTo()
        System.out.println(personas); // [Luis (25 años), Ana (30 años), Pedro (35 años)]
    }
}