package es.santander.ascender.conato04fichero;

import java.io.IOException;

public class FicheroMain {
    public static void main(String[] args) {
        try {
            // Llamar al método static main() de InfoFichero
            InfoFichero.main(args);  // Esto ejecutará el código de InfoFichero para verificar el archivo
            
            // Llamar al método lee() de LecturaFichero para leer el contenido del archivo
            LecturaFichero.lee();
            EscrituraFichero.escribe();
            AgregadoAFichero.agrega();

        } catch (IOException e) {
            // Manejo de la excepción IOException
            System.out.println("Se produjo un error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


