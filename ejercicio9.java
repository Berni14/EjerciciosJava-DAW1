import java.util.Scanner;

public class ejercicio9 {
    public static void binarioDecimal(int numero){
        int residuo;
        String binario = "";

        while (numero > 0) {
            residuo = numero % 2;
            binario = residuo + binario;
            numero = numero / 2;
        }
        System.out.println(binario);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int numero = sc.nextInt(); 
        binarioDecimal(numero);
        sc.close();
    }
}
