import java.io.IOException;

public class Ejercicio_01 {
    static void main(String[] args) {

        if(args.length == 0){
            System.out.println("[ERROR]: Argumentos no disponibles.");
            return;
        }

        ProcessBuilder pB = new ProcessBuilder(args);


        try{
            Process process = pB.start();
            int exitCode = process.waitFor();
            System.out.println("Comando ejecutado: "+String.join(" ", args));
            System.out.println("Código de finalización: "+ exitCode);
        } catch (Exception e) {
            System.out.println("[ERROR]: No se pudo ejecutar el comando" +e.getMessage());
        }

    }
}