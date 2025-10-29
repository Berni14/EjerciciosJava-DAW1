import java.util.Scanner;;
public class ejercicio14 {
    
    public static void factorial(int numero){
        int factorial= 1;
        for (int i = numero; i> 0; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el numero para calcular su factorial");
        int numero = sc.nextInt();

        factorial(numero);
        sc.close();
    }
}
