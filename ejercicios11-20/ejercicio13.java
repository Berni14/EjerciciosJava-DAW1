import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el texto");
        String texto = sc.nextLine();
        

        StringBuilder filtrado = new StringBuilder();
        for(int i= 0; i < texto.length();i++){
            char c = texto.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                filtrado.append(Character.toLowerCase(c));
            } 
        }
        String original = filtrado.toString();
        String invertido = filtrado.reverse().toString();

        if (original.equals(invertido)){
            System.out.println("Es un palindromo");
        } else{
            System.out.println("No es un palindromo");
        }


        sc.close();
    }
}