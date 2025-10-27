public class ejercicio4 {
    public static void main(String[] args) {
        boolean primo = true;
        int contPrimos;
        for(int i = 0; i <= 100; i++){
            primo = true;
            contPrimos = 0;
            for(int j = 1; j<=i; j++){
                if(i % j == 0){
                    contPrimos++;
                }
            }
            if(contPrimos != 2){
                    primo = false;
            }    
            if( !primo){
                System.out.println(i + " No es primo");
            }
            else{
                System.out.println(i + " Es primo");
            }
            
        }
    }
}
