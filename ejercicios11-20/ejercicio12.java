import java.util.Scanner;


public class ejercicio12 {
    public static void cadenas(String str1, String str2){

        String text1 = "";
        String text2 = "";




          for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2.indexOf(c) == -1) {
                text1 += c;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str1.indexOf(c) == -1) { 
                text2 += c;
            }
        }
        System.out.println(text1);
        System.out.println(text2);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el primer texto");
        String str1 = sc.nextLine();
        System.out.println("Escribe el segundo texto");
        String str2 = sc.nextLine();

        cadenas(str1, str2);
        sc.close();
        

        



    }
}
