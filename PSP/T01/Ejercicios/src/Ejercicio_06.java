import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio_06 {
    static void main(String[] args) {
        ProcessBuilder pB = new ProcessBuilder();
        try {
            pB.command("cmd.exe","/c","tuculo.exe");
            Process process = pB.start();
            Scanner sc = new Scanner(process.getErrorStream());
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch(IOException e){
            System.out.println("[ERROR] Comando no ejecutado "+e.getMessage());
        }
    }
}
