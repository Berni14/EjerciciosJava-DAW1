public class ejercicio15 {
    public static void armstrong(int numero){
        int numInicial = numero;
        int numArmstrong = 0;
        while(numero >= 0){
            numArmstrong = (numero % 10); 
            numero = numero/ 10;
        }
        System.out.println(numArmstrong);
    }
    public static void main(String[] args) {
        
    }
}
