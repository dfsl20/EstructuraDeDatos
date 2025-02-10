package t1comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @author dfsl 
 * Ejemplo uso d einterfaz ordenar
 * Biblioagrafia: https://www.youtube.com/watch?v=TpmkYD1OrKc
 */
public class Comparable {

    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        
        ArrayList<String> colores = new ArrayList<>();
        colores.add("Amarillo");
        colores.add("Azul");
        colores.add("Rojo");
        colores.add("Verde");
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(4444, "Maria", "Lopez", 1.52, EstadoCivil.CASADO));
        personas.add(new Persona(4444, "Zara", "Ramirez", 1.60, EstadoCivil.SOLTERO));
        personas.add(new Persona(4444, "Andrea", "Cano", 1.50, EstadoCivil.DIVORCIADO));
        personas.add(new Persona(4444, "Carol", "Camargo", 1.65, EstadoCivil.VIUDO));
        
        Collections.sort(personas); //Ordena numero en orden descendente
        mostrarLista(personas);
        
        //Collections.sort(colores); //Orden alfabetico
        //mostrarLista(colores);
        
    }
    
    public static void mostrarLista(List<?> lista){
        for (Object x : lista){
            System.out.print(x);
        }
    }
    
}
