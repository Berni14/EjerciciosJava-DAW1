import java.util.Scanner;

public class ejercicio5 {

    public static double calcularArea(String tipo, double medida1, double medida2) {
        tipo = tipo.toLowerCase();

        switch (tipo) {
            case "triangulo":
                return (medida1 * medida2) / 2; 
            case "cuadrado":
                return medida1 * medida1;
            case "rectangulo":
                return medida1 * medida2;
            default:
                System.out.println("Polígono no soportado");
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el polígono (triangulo, cuadrado, rectangulo): ");
        String tipo = sc.nextLine();

        double medida1 = 0, medida2 = 0;

        if (tipo.equalsIgnoreCase("triangulo") || tipo.equalsIgnoreCase("rectangulo")) {
            System.out.print("Introduce la base/lado1: ");
            medida1 = sc.nextDouble();
            System.out.print("Introduce la altura/lado2: ");
            medida2 = sc.nextDouble();
        } else if (tipo.equalsIgnoreCase("cuadrado")) {
            System.out.print("Introduce el lado: ");
            medida1 = sc.nextDouble();
            medida2 = 0; // no se usa
        } else {
            System.out.println("Polígono no soportado");
            sc.close();
            return;
        }

        double area = calcularArea(tipo, medida1, medida2);
        System.out.println("El área del " + tipo + " es: " + area);

        sc.close();
    }
}
