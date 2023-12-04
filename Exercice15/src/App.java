import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Input parameter a", "Input parameters", JOptionPane.QUESTION_MESSAGE));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Input parameter b", "Input parameters", JOptionPane.QUESTION_MESSAGE));
        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Input parameter c", "Input parameters", JOptionPane.QUESTION_MESSAGE));

        double d = (Math.pow(b, 2) - ( 4 * ( a * c ) ));
        if(d > 0) {
            double x1 = ((-b) + Math.sqrt(d)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(d)) / (2 * a); 
            System.out.println("We have 2 solutions for the equation " + x1 + " and " + x2);
        } else if(d == 0) {
            double x = (-b) / (2 * a);
            System.out.println("We have one solution and it's : " + x);
        } else {
            System.out.println("There is no real solution for the equation , try imaginary solutions that include i (i²=-1) ");
        }

        }
    
}

