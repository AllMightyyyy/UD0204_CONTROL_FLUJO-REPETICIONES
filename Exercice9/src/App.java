import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        /*
        Ejercicio 9
        Pedir números al usuario y cuando este introduzca un –1 terminará el programa.
        Al finalizar se mostrará lo siguiente:
        • El mayor de los números introducidos
        • El menor de los números introducidos
        • La suma de todos los números
        • La suma de todos los números positivos
        • La suma de todos los números negativos
        • La media de todos los números
        El –1 no contará como número.
        */
        while (true) {
        int initialNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Initial Number", "Number Game", JOptionPane.QUESTION_MESSAGE));
        int biggestNumber = initialNumber;
        int smallestNumber = initialNumber;
        if(initialNumber == -1) {
            System.out.println("your intial number was -1");
            break;
        } else {
            while(true) {
                int inputNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter A number", "Number game", JOptionPane.QUESTION_MESSAGE));
                int sumOfNumbers = initialNumber;
                int averageOfNumbers = initialNumber;
                int sumOfPositiveNumbers = 0;
                int sumOfNegativeNumbers = 0;
                if (initialNumber >= 0) {
                    sumOfPositiveNumbers = initialNumber;
                } else {
                    sumOfNegativeNumbers = initialNumber;
                }
                if (inputNumber == -1) {
                JOptionPane.showMessageDialog(null, "You entered -1, so byeeee!");
                break;
                } else {
                sumOfNumbers = sumOfNumbers + inputNumber;
                biggestNumber = Math.max(biggestNumber, inputNumber);
                smallestNumber = Math.min(smallestNumber, inputNumber);
                averageOfNumbers = (averageOfNumbers + inputNumber)/2 ;
                if (inputNumber >= 0) {
                    sumOfPositiveNumbers = sumOfPositiveNumbers + inputNumber;
                } else {
                    sumOfNegativeNumbers = sumOfNegativeNumbers + inputNumber;
                }

                }
                System.out.println("the biggest number is " + biggestNumber );
                System.out.println("the smallest number is " + smallestNumber);
                System.out.println("the sum of all numbers is " + sumOfNumbers);
                System.out.println("the sum of all positive numbers is " + sumOfPositiveNumbers);
                System.out.println("the sum of all negative numbers is " + sumOfNegativeNumbers);
                System.out.println("the average of all numbers is " + averageOfNumbers);
            }

            
        }
    }
        
    }
}