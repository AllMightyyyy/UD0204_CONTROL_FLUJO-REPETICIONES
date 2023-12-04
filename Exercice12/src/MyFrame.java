import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox<String> myComboBox;
    String selectedDirection;
    JButton submitMovementButton;
    JTextField textFieldMovement;
    int movementQuantity;
    int XPositionNow;
    int YPositionNow;
    int initialXPosition = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter your initial X position :", "Your Initial Position", JOptionPane.QUESTION_MESSAGE));
    int initialYPosition = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter your initial Y position :", "Your Initial Position", JOptionPane.QUESTION_MESSAGE));

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] directions = {"up", "down", "left", "right"};
        myComboBox = new JComboBox<>(directions);

        submitMovementButton = new JButton("Submit movement");
        submitMovementButton.setPreferredSize(new Dimension(150, 30));
        submitMovementButton.addActionListener(this);
        

        textFieldMovement = new JTextField("movement");
        textFieldMovement.setPreferredSize(new Dimension(80, 30));

        this.add(submitMovementButton);
        this.add(textFieldMovement);
        this.add(myComboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitMovementButton) {
            movementQuantity = Integer.parseInt(textFieldMovement.getText());
            selectedDirection = (String) myComboBox.getSelectedItem();
        }

        if (selectedDirection.equalsIgnoreCase("up")) {
            for(int i = 0; i <= movementQuantity; i++) {
                XPositionNow = initialXPosition;
                YPositionNow = initialYPosition + i;
                System.out.println("The Character moves to the position x = " + XPositionNow + " and y = " + YPositionNow);
            }
        } else if (selectedDirection.equalsIgnoreCase("down")) {
            for(int i = 0; i <= movementQuantity; i++) {
                XPositionNow = initialXPosition;
                YPositionNow = initialYPosition - i;
                System.out.println("The Character moves to the position x = " + XPositionNow + " and y = " + YPositionNow);
            }
        } else if (selectedDirection.equalsIgnoreCase("right")) {
            for(int i = 0; i <= movementQuantity; i++) {
                XPositionNow = initialXPosition + i;
                YPositionNow = initialYPosition;
                System.out.println("The Character moves to the position x = " + XPositionNow + " and y = " + YPositionNow);
            }
        } else if (selectedDirection.equalsIgnoreCase("left")) {
            for(int i = 0; i <= movementQuantity; i++) {
                XPositionNow = initialXPosition - i;
                YPositionNow = initialYPosition;
                System.out.println("The Character moves to the position x = " + XPositionNow + " and y = " + YPositionNow);
            }
        }
    }
}