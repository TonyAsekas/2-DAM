import java.io.File;
import java.io.IOException;

public class Ejercicio_09 {
    static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("[ERROR] Debe indicar el nombre del archivo de salida");
            return;
        }

        File dirSalida = new File(args[0]);
        File dirError = new File("errores.txt");

        ProcessBuilder pB = new ProcessBuilder("cmd.exe", "/c", "dir");
        pB.redirectOutput(dirSalida);
        pB.redirectError(dirError);

        try {
            Process process = pB.start();
            int exitCode = process.waitFor();

            System.out.println("Proceso finalizado con código: " + exitCode);
            System.out.println("Ruta absoluta del archivo: " + dirSalida.getAbsolutePath());
            System.out.println("Tamaño del archivo de salida: " + dirSalida.length() + " bytes");

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
