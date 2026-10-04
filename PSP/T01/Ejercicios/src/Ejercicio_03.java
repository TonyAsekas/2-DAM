import java.io.IOException;

public class Ejercicio_03 {
    static void main(String[] args) {
        ProcessBuilder pB = new ProcessBuilder();
        try{
            pB.command("notepad.exe");
            Process process = pB.start();
            while(process.isAlive()){
                Thread.sleep(3000);
                System.out.println("El proceso sigue activo...");
            }
            System.out.println("Proceso finalizado");
        } catch (Exception e) {
            System.out.println("[ERROR] Comando no ejecutado "+e.getMessage());
        }
    }
}
