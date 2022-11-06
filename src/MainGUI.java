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
    private JRadioButton dbPersistenceRadioButton;
    private JRadioButton filePersistenceRadioButton;
    private JList list1;
    private JPanel listPanel;
    private JPanel leftPanel;
    private JPanel savePanel;
    private JPanel inputPanel;
    private JPanel inchesPanel;
    private Person newPerson;
    private DefaultListModel<String> personListModel;

    public MainGUI(String title) throws HeadlessException {
        super(title);
        ButtonGroup radioButtonsGroup = new ButtonGroup();
        radioButtonsGroup.add(dbPersistenceRadioButton);
        radioButtonsGroup.add(filePersistenceRadioButton);
        personListModel = new DefaultListModel<>();
        list1.setModel(personListModel);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(800,800);
        this.setLocationRelativeTo(null);




        showPersonDetailsBtn.addActionListener(e -> {
            newPerson =  PersonHandler.Companion.createPerson(nameInput.getText(),
                                                                    Integer.parseInt(ageInput.getText()),
                                                                    Integer.parseInt(heightInput.getText()),
                                                                    Integer.parseInt(weightInput.getText()),
                                                                    emailInput.getText());

            refreshList();
            clearFields();

            System.out.println(Main.dataBase);
            System.out.println(newPerson.getUserName());
            System.out.println(newPerson.getPassword());


//            list1.;


        });

        calculateInchesButton.addActionListener(e1 -> {
                    heightInInchesResult.setText(String.valueOf(PersonHandler.Companion.heightToInches(newPerson)));
        });

//        calculateInchesButton.addActionListener(e -> {
//            var newPerson =  PersonHandler.Companion.createPerson(nameInput.getText(),
//                                                                            Integer.parseInt(ageInput.getText()),
//                                                                            Integer.parseInt(heightInput.getText()),
//                                                                            Integer.parseInt(weightInput.getText()),
//                                                                            emailInput.getText());
//            heightInInchesResult.setText(String.valueOf(PersonHandler.Companion.heightToInches(newPerson)));
//        });
    }

    private void refreshList(){
//        clear the list
        personListModel.removeAllElements();

//        add all elements from the array to the list
        for (Person p : Main.dataBase) {
            personListModel.addElement(p.toString());

        }
    }

    private void clearFields(){
        nameInput.setText("");
        emailInput.setText("");
        ageInput.setText("");
        weightInput.setText("");
        heightInput.setText("");

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
