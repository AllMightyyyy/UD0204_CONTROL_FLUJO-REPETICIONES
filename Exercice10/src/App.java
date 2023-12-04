import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        /*
         Ejercicio 10
            Crea el juego de adivinar el número. El usuario deberá intentar adivinar un número generado aleatoriamente. Tendremos los siguientes casos:
            • Si se introduce un número menor que el número a adivinar → Avisamos al usuario de que el número que queremos adivinar es mayor.
            • Si se introduce un número mayor → Avisamos de que el número a adivinar es menor.
            • Si acertamos el número → Avisamos de que se ha acertado el número y finalizamos el programa.	 	
            El juego debe acabar cuando el usuario acierte el número. 
         *
         */
        Random random = new Random();
        int numberToGuess = random.nextInt(500);
        System.out.println("SECRETLY OUR NUMBER IS " + numberToGuess);
         while(true) {
            
            int userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to Guess the number", "Guessing game", JOptionPane.QUESTION_MESSAGE));
            if(userGuess == numberToGuess) {
                System.out.println("YOU GUESSED CORRECTLY, CONGRATS!");
                break;
         }  else if (userGuess > numberToGuess) {
                System.out.println("You need to enter a Lower Number than that");
         }  else if (userGuess < numberToGuess) {
                System.out.println("You need to enter a bigger Number than that");
         }

        }  
     }
}
