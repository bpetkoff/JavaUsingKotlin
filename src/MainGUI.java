import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame {
    private JPanel mainPanel;
    private JLabel nameLbl;
    private JTextField nameInput;
    private JTextField ageInput;
    private JLabel ageLbl;
    private JLabel printNameAndAgeLbl;
    private JButton showPersonDetailsBtn;
    private JTextField heightInput;
    private JLabel weightLable;
    private JLabel heightLable;
    private JTextField weightInput;
    private JLabel emailAddress;
    private JTextField emailInput;
    private JLabel heightInInch;
    private JButton calculateInchesButton;
    private JLabel heightInInchesResult;

    public MainGUI(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(500,500);
        this.setLocationRelativeTo(null);



        showPersonDetailsBtn.addActionListener(e -> {
            var newPerson =  PersonHandler.Companion.createPerson(nameInput.getText(),
                                                                    Integer.parseInt(ageInput.getText()),
                                                                    Integer.parseInt(heightInput.getText()),
                                                                    Integer.parseInt(weightInput.getText()),
                                                                    emailInput.getText());
            System.out.println(newPerson);

            printNameAndAgeLbl.setText(newPerson.toString());
        });


        calculateInchesButton.addActionListener(e -> {
            var newPerson =  PersonHandler.Companion.createPerson(nameInput.getText(),
                                                                            Integer.parseInt(ageInput.getText()),
                                                                            Integer.parseInt(heightInput.getText()),
                                                                            Integer.parseInt(weightInput.getText()),
                                                                            emailInput.getText());
            heightInInchesResult.setText(String.valueOf(String.valueOf(PersonHandler.Companion.heightToInches(newPerson))));
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
