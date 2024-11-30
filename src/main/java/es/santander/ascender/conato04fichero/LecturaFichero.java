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
            // Nos quedaremos con esta última  que engloba a ambas. Superclase.
            int caracterLeido=0; // La inicializamos para que el while no de error

            // Un fichero de caracteres terminará cuando aperezca un valor -1
            while (caracterLeido!=-1) {
                caracterLeido=entrada.read();
                char letra = (char) caracterLeido; // casting para pasar el código a unicode.
                System.out.print(letra);
            } 
            entrada.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Fichero no encontrado.");
        }
    }
}
