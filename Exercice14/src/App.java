import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        char[] vowels = {'A', 'E','I', 'O', 'U', 'Y'};
        String input = JOptionPane.showInputDialog(null, "Input a Word", "Input", JOptionPane.QUESTION_MESSAGE);
        input = input.toUpperCase();
        int vowelCounter = 0;
        for(int i = 0; i < input.length(); i++) {
            for(int j = 0; j < vowels.length; j++) {
                if(input.charAt(i) == vowels[j]) {
                    vowelCounter++;
                }
            }
        }
        System.out.println("The number of vowels is " + vowelCounter);
    }
}
