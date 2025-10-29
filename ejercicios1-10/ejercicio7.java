import java.util.Scanner;

public class ejercicio7 {
    public static void invertir (String palabra){
        char[] letra = palabra.toCharArray();
        for(int i = palabra.length() - 1; i >= 0; i--){
            System.out.print(letra[i]);
        }
    } 
    public static void main(String[] args) {
        String palabra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el texto a invertir");
        palabra = sc.nextLine();
        invertir(palabra);
        sc.close();
    }
}
