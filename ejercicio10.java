import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio10{
    public static void codigoMorse(String texto){
        
        List<String> abcLista = new ArrayList<>();
        String textoMorse = "";
        String[] morseCodes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        for (char c = 'a' ; c <= 'z'; c++){
            abcLista.add(String.valueOf(c));
        }
        texto = texto.toLowerCase();


        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra == ' ') {
                textoMorse += " / ";
            } else {
                int indice = abcLista.indexOf(String.valueOf(letra));
                if (indice != -1) {
                    textoMorse += morseCodes[indice] + " ";
                }
            }
        }
        System.out.print(textoMorse);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto para pasar a morse");
        String texto = sc.nextLine();
        codigoMorse(texto);
        sc.close();
    }
}