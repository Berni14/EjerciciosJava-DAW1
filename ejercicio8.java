import java.util.Scanner;

public class ejercicio8 {
    public static void conteoPalabras(String texto){
        int contPalabras= 1;
        char[] letra = texto.toCharArray();
        for (int i = 0; i <= texto.length() - 1; i++){
            if (letra[i] == ' '){
                contPalabras++;
            }
        }
        System.out.println("Hay " + contPalabras+" palabras");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto;
        
        System.out.println("Escribe un texto para contar cuantas palabras tiene");
        texto = sc.nextLine();
        
        conteoPalabras(texto);
        

        sc.close();
    }

}
