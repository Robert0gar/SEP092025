import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda("arbol_log.txt");
        Random random = new Random();

        // Insertar 20 números aleatorios
        System.out.println("Se insertaran estos 20 números aleatorios en el árbol:");
        for (int i = 0; i < 20; i++) {
            int valor = random.nextInt(100) + 1; // números entre 1 y 100
            arbol.insertar(valor);
            System.out.print(valor + " ");
        }
        System.out.println("\nInserción completa:");

        // Contar búsquedas fallidas antes de encontrar uno correcto
        int fallidas = 0;
        boolean encontrado = false;
        while (!encontrado) {
            int valorBuscado = random.nextInt(100) + 1;
            System.out.println("Buscando: " + valorBuscado);
            if (arbol.buscar(valorBuscado)) {
                encontrado = true;
                System.out.println("Encontrado después de: " + fallidas + " búsquedas fallidas");
            } else {
                fallidas++;
            }
        }

        arbol.cerrarLog();
    }
}
