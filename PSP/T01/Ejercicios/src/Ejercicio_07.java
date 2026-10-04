import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_07 {
    static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("[ERROR] Debe indicar la ruta de un directorio como argumento");
            return;
        }

        ProcessBuilder pB = new ProcessBuilder("cmd.exe", "/c", "dir");
        File dir = new File(args[0]);

        if (!dir.exists() || !dir.isDirectory()) {
            throw new RuntimeException("El fichero no existe o no es un directorio");
        }

        pB.directory(dir);

        try {
            Process process = pB.start();
            Scanner sc = new Scanner(process.getInputStream());
            int contador = 1;
            while (sc.hasNextLine()) {
                System.out.println(contador + " : " + sc.nextLine());
                contador++;
            }
        } catch (IOException e) {
            System.out.println("[ERROR] Comando no ejecutado " + e.getMessage());
        }
    }
}