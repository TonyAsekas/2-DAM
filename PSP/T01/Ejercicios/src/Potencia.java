public class Potencia {

    static void main(String[] args) {
        //Comprobamos q recibe exactamente dos aprametros
        if(args.length != 2){
            System.out.println("[ERROR] Debe recibir dos argumentos");
            System.exit(1);
        }
        int base = 0;
        int exponente = 0;

        try {
             base = Integer.parseInt(args[0]);
            exponente = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] Los apraamteros deben ser enteros");
            System.exit(2);

        }
      double resultado = Math.pow(base,exponente);
        System.out.println(resultado);
    }
}
