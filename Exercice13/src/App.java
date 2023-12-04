import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Input A Word", "INPUT", JOptionPane.QUESTION_MESSAGE);
        char[] inputCharArray = input.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < (input.length()/2); i++) {
            stringBuilder.append(inputCharArray[i]);
    }
    String result = stringBuilder.toString();
    System.out.println(result);
    }
}
