import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

void main(){
    Path carpeta_origen = Path.of("src","entrada");
    System.out.println(carpeta_origen);
    try {
        Files.createDirectories(carpeta_origen);
        Path fichero_destino = carpeta_origen.resolve("fichero.txt");
        System.out.println(fichero_destino);
        Files.createFile(fichero_destino);
        if(!Files.exists(fichero_destino))
        {
           Files.createFile(fichero_destino);
           String cadena_texto = "";
        } else {
            System.out.println("El fichero ya existe");
        }
    } catch (IOException e) {
        System.out.println("Error: "+e.getMessage());
    }
}