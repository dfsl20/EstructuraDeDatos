import java.util.*;

class Persona implements Comparable<Persona> {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        return Integer.compare(this.edad, otra.edad); // Ordena por edad (Comparable)
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

public class OrdenarPersonas {
    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Juan", 30),
            new Persona("Ana", 25),
            new Persona("Luis", 35),
            new Persona("Pedro", 28),
            new Persona("María", 22),
            new Persona("Carlos", 40),
            new Persona("Elena", 19),
            new Persona("Sofía", 33),
            new Persona("David", 27),
            new Persona("Raúl", 31)
        };

        // Ordenar por edad usando Comparable
        Arrays.sort(personas);
        System.out.println("Ordenado por edad:");
        System.out.println(Arrays.toString(personas));

        // Ordenar por nombre usando Comparator
        Arrays.sort(personas, Comparator.comparing(p -> p.nombre));
        System.out.println("\nOrdenado por nombre:");
        System.out.println(Arrays.toString(personas));
    }
}
