import java.util.Scanner;

public class ejercicio11 {

    public static void equilibrado(String texto) {
        int contP = 0;
        int contC = 0;
        int contL = 0;

        char[] letra = texto.toLowerCase().toCharArray();

        for (int i = 0; i < texto.length(); i++) {
            if (letra[i] == '(')
                contP++;
            if (letra[i] == ')')
                contP--;
            if (letra[i] == '[')
                contC++;
            if (letra[i] == ']')
                contC--;
            if (letra[i] == '{')
                contL++;
            if (letra[i] == '}')
                contL--;

            if (contP < 0 || contC < 0 || contL < 0) {
                System.out.println("❌ Error: símbolo de cierre sin apertura");
                return;
            }
        }

        if (contP == 0 && contC == 0 && contL == 0) {
            System.out.println("✅ Expresión correcta");
        } else {
            System.out.println("❌ Revisa la expresión: faltan símbolos de cierre o apertura");
        }
    }
    public static void main(String[] args) {
        String texto = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la expresion");
        texto = sc.nextLine();
        equilibrado(texto);

        sc.close();
    }
}
