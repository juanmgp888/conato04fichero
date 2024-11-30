package es.santander.ascender.conato04fichero;

import java.io.FileReader;
import java.io.IOException;

// Consultar métodos reader y writer
public class LecturaFichero {

    public static void lee() throws IOException {
        try {
            FileReader entrada = new FileReader("/home/curso04/Desktop/conatos/conato04fichero/src/test/java/es/santander/ascender/conato04fichero/datos.txt");
            // Método read lee carácter a carácter del fichero, devolviendo
            // su código en formato entero (int).
            // El constructor (ver API) lanza una excepción FileNotFoundException,
            // pero el método 'read' lanza una de tipo IOException.
            // Nos quedaremos con esta última (dentro del catch) que engloba a ambas. Superclase.
            int caracterLeido;// = entrada.read(); Sobra esta parte derecha, porque leería el primer caracter sin pasar por el bucle y ser visualizado

            // Un fichero de caracteres terminará cuando aperezca un valor -1
            do {
                caracterLeido=entrada.read();
                char letra = (char) caracterLeido; // casting para pasar el código a unicode.
                System.out.print(letra);
            } while (caracterLeido!=-1); // Lo pongo que do while, pq para evaluar la condición, la variable ha tenido que ser inicializada
            entrada.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fichero no encontrado.");
        }
    }
}
