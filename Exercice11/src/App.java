import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        /*
        Ejercicio 11
        Comprueba si una palabra es capicúa, 
        es decir, se lee igual de izquierda a 
        derecha que de derecha a izquierda. 
        Para ello utiliza bucles y comprueba
        carácter a carácter.
         */

        String word = JOptionPane.showInputDialog(null, "Enter a word to check if it's a Palindrome or not", "Palindrome Game", JOptionPane.WARNING_MESSAGE);
        
        isPalindrome startGame = new isPalindrome(word);
    } 
}

   