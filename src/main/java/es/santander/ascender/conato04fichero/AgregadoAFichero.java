package es.santander.ascender.conato04fichero;

import java.io.FileWriter;
import java.io.IOException;

public class AgregadoAFichero {

    public static void agrega(){

        String textoAAgregar = "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor.";
        // Usando otro constructor que tiene un segundo parámentro booleano, si el fichero existe, agrega más contenido al final del mismo.
        try {
            FileWriter salida = new FileWriter("/home/curso04/Desktop/conatos/conato04fichero/src/test/java/es/santander/ascender/conato04fichero/datos.txt",true);

            // Vamos a escribir caracter a caracter la cadena arriba declarada.
            // Usaremos un ciclo for hasta que la longitud de la frase se alcance.
            for (int i=0;i<textoAAgregar.length();i++){
                salida.write(textoAAgregar.charAt(i));
                // Va a escribir en el flujo de escritura creado, cada caracter de la cadena
            }
            salida.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}
