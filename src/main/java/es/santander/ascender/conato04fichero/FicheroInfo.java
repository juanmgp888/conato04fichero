package es.santander.ascender.conato04fichero;
import java.io.File;

public class FicheroInfo {
// Principales métodos
// Supongamos que hemos recibido un archivo datos.txt
   
        public static void main(String[] args) {
            // Para el ejemplo, debe exitir el fichero en 
            // src/test/java/es/santander/ascender/conato04fichero
            File miFichero = new File("src/test/java/es/santander/ascender/conato04fichero/datos.txt");
            if (miFichero.exists()) {
                System.out.println(miFichero.getName() + " , existe.");

                if (miFichero.canRead())
                    System.out.println(" Se puede leer.");
                else
                    System.out.println(" No se puede leer.");
                if (miFichero.canWrite())
                    System.out.println(" Permite la escritura.");
                else
                    System.out.println(" No permite la escritura. (No implica que pueda leerse)");
                if (miFichero.canExecute())
                    System.out.println(" Se puede ejecutar.");
                else
                    System.out.println(" No se puede ejecutar.");

                System.out.println("Path completo (absoluto): " +miFichero.getAbsolutePath());
                    
                // Obtener el directorio donde reside el archivo (o puedes usar el directorio raíz)
                File directorio = miFichero.getParentFile();
                System.out.println("Directorio donde está el archivo: " +directorio);

                // Obtener el espacio usable (en bytes) y convertirlo a kilobytes
                long espacioUsableKB = directorio.getUsableSpace() / 1024;

                // Obtener el espacio total (en bytes) y convertirlo a megabytes
                long espacioTotalMB = directorio.getTotalSpace() / 1024 / 1024;

                // Mostrar los resultados
                System.out.println("Espacio disponible en la unidad de almacenamiento donde está el directorio de trabajo: " + espacioUsableKB + " Kbytes");
                System.out.println("Espacio total de la unidad de almacenamiento: " + espacioTotalMB + " MB");

                System.out.println("Nombre del fichero: "+ miFichero.getName());
                System.out.println("File Size: "+ (miFichero.length()) + " bytes");
            } else
                System.out.println("File does not exist");
        }
}
