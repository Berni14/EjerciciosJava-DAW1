import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String url;
        int ancho, alto, divisor, ratioAncho, ratioAlto;
        
        System.out.println("Introduce la URL de la imagen");
        url = sc.nextLine();

        System.out.println("Introduce el ancho (en pixeles)");
        ancho = sc.nextInt();

        System.out.println("Introduce el alto (en pixeles)");
        alto = sc.nextInt();

        divisor = MDC(ancho, alto);

        ratioAncho = ancho / divisor;
        ratioAlto = alto / divisor;

        System.out.println(" El url: "+ url +" El aspect ratio de la imagen es: "+ ratioAncho + ":" +ratioAlto);

        sc.close();
    }

    public static int  MDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}