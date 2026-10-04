import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Ejercicio_04 {
    static void main(String[] args) {
        ProcessBuilder pB = new ProcessBuilder(args);
        try{
            pB.command("notepad.exe");
            Process process = pB.start();
            final long TIEMPO_MAXIMO = 5000;
            boolean finalizado = process.waitFor(TIEMPO_MAXIMO, TimeUnit.MILLISECONDS);
            if(!finalizado){
                process.destroy();
                System.out.println("El proceso se ha finalizado manualmente");
            }else{
                System.out.println("El proceso ha terminado");
            }

        } catch (Exception e) {
            System.out.println("[ERROR] Comando no ejecutado "+e.getMessage());
        }

    }
}
