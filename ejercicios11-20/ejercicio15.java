import java.util.Scanner;

public class ejercicio15 {
    public static void armstrong(int numero){
        int numArmstrong=0;
        int tamaño= 0;
        int numAuxiliar = numero; int numInicial= numero;
        while (numAuxiliar > 0) {
            numAuxiliar /= 10;
            tamaño++;
        }

        numAuxiliar = numero;
        while (numAuxiliar > 0) {
            int digito = numAuxiliar % 10;
            numArmstrong += (int) Math.pow(digito, tamaño);
            numAuxiliar /= 10;
        }
        System.out.println(numArmstrong);
        if (numInicial == numArmstrong){
            System.out.println("Es un numero Armstrong");
        } else{
            System.out.println("No es un numero Armstrong");
        }
    }
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero para ver si es un numero armstrong");
        int numero = sc.nextInt();

        armstrong(numero);

        sc.close();
    }
}
