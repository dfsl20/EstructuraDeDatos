import java.util.*;

class Producto {
    private String referencia;
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    public Producto(String referencia, String nombre, int cantidad, double precioUnitario) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getReferencia() { return referencia; }
    public String getNombre() { return nombre; }
    public int getCantidad() { return cantidad; }
    public double getPrecioUnitario() { return precioUnitario; }

    @Override
    public String toString() {
        return String.format("Referencia: %s, Nombre: %s, Cantidad: %d, Precio Unitario: %.2f",
                referencia, nombre, cantidad, precioUnitario);
    }
}

public class OrdenarProductos {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>(Arrays.asList(
                new Producto("P001", "Manzanas", 50, 500),
                new Producto("P002", "Peras", 30, 700),
                new Producto("P003", "Naranjas", 20, 600),
                new Producto("P004", "Plátanos", 25, 400),
                new Producto("P005", "Uvas", 10, 1500),
                new Producto("P006", "Fresas", 15, 2000),
                new Producto("P007", "Kiwis", 5, 1800),
                new Producto("P008", "Cerezas", 8, 2500),
                new Producto("P009", "Mangos", 12, 1200),
                new Producto("P010", "Sandías", 7, 3000)
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Desea agregar un nuevo producto a la lista? (s/n)");
        String opcion = scanner.next();
        if (opcion.equalsIgnoreCase("s")) {
            System.out.println("Ingrese la referencia del producto:");
            String referencia = scanner.next();
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.next();
            System.out.println("Ingrese la cantidad del producto:");
            int cantidad = scanner.nextInt();
            System.out.println("Ingrese el precio unitario del producto:");
            double precioUnitario = scanner.nextDouble();
            productos.add(new Producto(referencia, nombre, cantidad, precioUnitario));
        }

        System.out.println("¿Desea buscar un producto por su referencia? (s/n)");
        String buscar = scanner.next();
        if (buscar.equalsIgnoreCase("s")) {
            System.out.println("Ingrese la referencia del producto a buscar:");
            String referenciaBuscada = scanner.next();
            Producto productoEncontrado = buscarProductoPorReferencia(productos, referenciaBuscada);
            if (productoEncontrado != null) {
                System.out.println("Producto encontrado: " + productoEncontrado);
            } else {
                System.out.println("Producto no encontrado.");
            }
        }


        System.out.println("Seleccione el método de ordenación: 1. Insertion Sort 2. Bubble Sort");
        int metodo = scanner.nextInt();

        System.out.println("Seleccione el criterio de ordenación: 1. Referencia 2. Nombre 3. Cantidad 4. Precio Unitario");
        int criterio = scanner.nextInt();

        if (metodo == 1) {      
            insertionSort(productos, criterio);
        } else if (metodo == 2) {
            bubbleSort(productos, criterio);
        } else {
            System.out.println("Método no válido");
            return;
        }

        System.out.println("Productos ordenados:");
        productos.forEach(System.out::println);
    }

    public static Producto buscarProductoPorReferencia(List<Producto> productos, String referencia) {
        for (Producto producto : productos) {
            if (producto.getReferencia().equalsIgnoreCase(referencia)) {
                return producto;
            }
        }
        return null;
    }


    public static void insertionSort(List<Producto> productos, int criterio) {
        for (int i = 1; i < productos.size(); i++) {
            Producto key = productos.get(i);
            int j = i - 1;
            while (j >= 0 && comparar(productos.get(j), key, criterio) > 0) {
                productos.set(j + 1, productos.get(j));
                j--;
            }
            productos.set(j + 1, key);
        }
    }

    public static void bubbleSort(List<Producto> productos, int criterio) {
        int n = productos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (comparar(productos.get(j), productos.get(j + 1), criterio) > 0) {
                    Collections.swap(productos, j, j + 1);
                }
            }
        }
    }

    public static int comparar(Producto p1, Producto p2, int criterio) {
        return switch (criterio) {
            case 1 -> p1.getReferencia().compareTo(p2.getReferencia());
            case 2 -> p1.getNombre().compareTo(p2.getNombre());
            case 3 -> Integer.compare(p1.getCantidad(), p2.getCantidad());
            case 4 -> Double.compare(p1.getPrecioUnitario(), p2.getPrecioUnitario());
            default -> 0;
        };
    }
}
