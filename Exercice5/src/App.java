public class App {
    public static void main(String[] args) {
        int sumOfNumbers = 0;
    /**
     * @param args
     */
    
        for(int i = 1; i <= 100; i++) {
            sumOfNumbers = sumOfNumbers + i;
        }

        System.out.println("The sum of numbers is " + sumOfNumbers);
    }
}
