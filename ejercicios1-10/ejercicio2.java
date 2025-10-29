
/*
 Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Bool) según sean o no anagramas.
 - Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 - NO hace falta comprobar que ambas palabras existan.
 - Dos palabras exactamente iguales no son anagrama.
 */


public class ejercicio2 {
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.equalsIgnoreCase(palabra2)){
            return false;
        }
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        char[] letras1 = palabra1.toLowerCase().toCharArray();
        char[] letras2 = palabra2.toLowerCase().toCharArray();

        java.util.Arrays.sort(letras1);
        java.util.Arrays.sort(letras2);

        return java.util.Arrays.equals(letras1, letras2);


    }
    public static void main(String[] args) {
        System.out.println(sonAnagramas("roma", "amor"));
    }
}   
