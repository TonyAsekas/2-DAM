import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio_08 {
    static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("[ERROR] Debe indicar al menos un comando como argumento");
            return;
        }

        ProcessBuilder pB = new ProcessBuilder("cmd.exe");

        pB.redirectErrorStream(true);

        try {
            Process process = pB.start();
            PrintWriter pw = new PrintWriter(process.getOutputStream(), true);


            pw.println(args[0]);
            pw.println("java -version");
            pw.println("exit");

            Scanner sc = new Scanner(process.getInputStream());
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            pw.close();
            sc.close();

        } catch (IOException e) {
            throw new RuntimeException("Error en la ejecución del proceso: " + e.getMessage());
        }
    }
}