import java.util.ArrayList;

public class Ejercicio_05 {
    static void main(String[] args) {
        ProcessBuilder pB = new ProcessBuilder();
        ArrayList<String> comandos = new ArrayList<>();
        comandos.add("notepad.exe");
        comandos.add("calc.exe");
        ArrayList<Process> process = new ArrayList<>();
        try{
            for (String cmd : comandos) {
                pB.command(cmd);
                Process p = pB.start();
                process.add(p);
            }
            for (Process p : process){
                p.waitFor();
                if(p.exitValue() == 0){
                    System.out.println("Proceso finalizado correctamente");
                }else{
                    System.out.println("EL proceso finalizó con errores- Código: "+p.exitValue());
                }

            }

        } catch (Exception e) {
            System.out.println("[ERROR] Comando no ejecutado "+e.getMessage());
        }
    }
}
