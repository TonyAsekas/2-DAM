import java.io.File;
import java.io.IOException;

public class Ejercicio_02 {
    static void main(String[] args) {
        ProcessBuilder pB = new ProcessBuilder();
        pB.directory(new File("C:\\Users\\toni1\\OneDrive\\Escritorio\\Asignaturas Módulo\\2º DAM\\PSP\\T01\\Ejercicios\\Ejercicios\\src"));
        File dir = pB.directory();
        System.out.println(dir);
        try{
            pB.command("notepad.exe");
            Process process = pB.start();
            long pid = process.pid();
            System.out.println(pid);
            Thread.sleep(2000);
            if (process.isAlive()){
                process.destroy();
                System.out.println("Terminamos el proceso de forma manual");
            }else{
                System.out.println("El proceso ha finalizado");
            }
        } catch (Exception e) {
            System.out.println("[Error] No se pudo ejecutar el comando" +e.getMessage());
        }
    }
}
