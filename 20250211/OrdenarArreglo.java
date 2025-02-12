public class OrdenarArreglo {
    public static void main(String[] args) {
        // Crear un arreglo desordenado con 10 números
        int[] arregloDesordenado = {42, 15, 8, 23, 4, 16, 99, 12, 57, 31};

        // Crear un arreglo para almacenar los números ordenados
        int[] arregloOrdenado = new int[arregloDesordenado.length];

        // Copiar el arreglo desordenado al arreglo ordenado
        System.arraycopy(arregloDesordenado, 0, arregloOrdenado, 0, arregloDesordenado.length);

        // Ordenar el arreglo usando el algoritmo de Burbuja
        for (int i = 0; i < arregloOrdenado.length - 1; i++) {
            for (int j = 0; j < arregloOrdenado.length - i - 1; j++) {
                if (arregloOrdenado[j] > arregloOrdenado[j + 1]) {
                    // Intercambiar los elementos si están en el orden incorrecto
                    int temp = arregloOrdenado[j];
                    arregloOrdenado[j] = arregloOrdenado[j + 1];
                    arregloOrdenado[j + 1] = temp;
                }
            }
        }

        // Mostrar el arreglo desordenado
        System.out.print("Arreglo Desordenado: ");
        for (int num : arregloDesordenado) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mostrar el arreglo ordenado
        System.out.print("Arreglo Ordenado: ");
        for (int num : arregloOrdenado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
