public class ejercicio3 {
    
    public static void main(String[] args) {
        int primerNumero= 0, segundoNumero=1;
        int fibonacci = primerNumero+ segundoNumero;
        System.out.println(primerNumero);
        System.out.println(segundoNumero);

        for (int i = 1; i <= 50 ; i++){
            fibonacci = primerNumero+ segundoNumero;
            System.out.println(fibonacci);
            primerNumero = segundoNumero;
            segundoNumero=fibonacci;
        }
    }
}
