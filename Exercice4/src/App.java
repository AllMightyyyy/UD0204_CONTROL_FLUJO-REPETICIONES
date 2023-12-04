import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        /*
         * Ejercicio 4
        Realiza una aplicación que nos pida un número de 
        ventas a introducir, después nos pedirá tantas ventas 
        por teclado como número de ventas se hayan indicado. 
        Al final mostrara la suma de todas las ventas. 
        Piensa que es lo que se repite y lo que no.
         */
        int numberOfSales = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Sales", "Sales Manager", JOptionPane.QUESTION_MESSAGE));
        int totalSaleValue = 0;
        int j = 1;
        while (numberOfSales > 0) {
            int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the value of sale number " + j, null, JOptionPane.INFORMATION_MESSAGE));
            totalSaleValue = totalSaleValue + input;
            j++;
            numberOfSales--;
        }
    JOptionPane.showMessageDialog(null, "The Total Value of sales is : "+ totalSaleValue, "SALES", JOptionPane.INFORMATION_MESSAGE);
    }
}