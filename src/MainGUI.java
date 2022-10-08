import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame {
    private JPanel mainPanel;
    private JLabel nameLbl;
    private JTextField nameInput;
    private JTextField ageInput;
    private JLabel ageLbl;
    private JLabel printNameAndAgeLbl;
    private JButton showPersonDetailsBtn;
    private Dimension size;
    private Toolkit toolkit;

    public MainGUI(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(500,300);
        this.size = new Dimension();
        this.setLocationRelativeTo(null);

        showPersonDetailsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameInput.getText();
                int age = (int) Integer.parseInt(ageInput.getText());
                Person addPerson = new Person(name, age);

                printNameAndAgeLbl.setText(addPerson.toString());

            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
