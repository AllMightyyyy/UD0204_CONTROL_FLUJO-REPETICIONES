public class App {
    public static void main(String[] args) {
        /*
        Ejercicio 6
        Utiliza otros dos contadores para almacenar en uno de ellos la suma
         de todos los números pares y en el otro de los números impares desde
          el número 1 hasta el 100.
         */
        int sumOfPair = 0;
        int sumOfImpair = 0;
        
         for(int i = 1; i <= 100; i++) {
            if(i%2 == 0) {
                sumOfPair = sumOfPair + i;
            } else if (i%2 != 0) {
                sumOfImpair = sumOfImpair + i;
            }
        }
        System.out.println("Sum of Pair numbers is "+ sumOfPair +", While sum of Impair numbers is "+ sumOfImpair);
    }
}
