import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
    /*
    Ejercicio 7
    Pide al usuario por teclado que introduzca dos números, 
    imprime todos los números entre ambos (imprimiendo ambos también). 
    Haz este proceso usando un bucle que pida números hasta que alguno 
    de los dos sea –1 
    */
    //break condition should be -1
    //we will print all numbers between 2 user inputs
    int bucle = 1;
    while(bucle != 0) {
        int numbre1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Number 1", "Included Numbers", JOptionPane.QUESTION_MESSAGE));
        int numbre2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Number 2", "Included Numbers", JOptionPane.QUESTION_MESSAGE));

        if (numbre1 == -1 || numbre2 == -1) {
            System.out.println("Bye bruh!");
            break;
        } else {
            int biggerNumber = Math.max(numbre1, numbre2);
            int smallerNumber = Math.min(numbre1, numbre2);

            for (int i = smallerNumber; i <= biggerNumber; i++) {
                System.out.println(i);
            }
        }
    }



    }
}
