# conato04fichero
Clase DarInfoFichero:
Tratamiento de ficheros. Obtención de datos. Posibles errores.
Uso de los métodos de la clase File. 
import java.io.File;

mi clase LeerFichero:
import java.io.Reader
subclase : InputStreamReader
https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html
Ideal para convertir (decodificar) flujos de bytes en flujos de caracteres
https://docs.oracle.com/javase/8/docs/api/java/io/FileReader.html 

FileReader extiende de InputStreamReader
Convenience class for reading character files. The constructors of this class assume that the default character encoding and the default byte-buffer size are appropriate. To specify these values yourself, construct an InputStreamReader on a FileInputStream.

FileReader está pensado para leer flujos/streams de caracteres. For reading streams of raw bytes, consider using a FileInputStream.
