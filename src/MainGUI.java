import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
    private JList listMain;
    private JPanel listPanel;
    private JPanel leftPanel;
    private JPanel savePanel;
    private JPanel inputPanel;
    private JPanel inchesPanel;
    private JButton editButton;
    private Person newPerson;
    private DefaultListModel<String> personListModel;

    public MainGUI(String title) throws HeadlessException {
        super(title);
        ButtonGroup radioButtonsGroup = new ButtonGroup();
        radioButtonsGroup.add(dbPersistenceRadioButton);
        radioButtonsGroup.add(filePersistenceRadioButton);
        personListModel = new DefaultListModel<>();
        listMain.setModel(personListModel);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(800,800);
        this.setLocationRelativeTo(null);




        showPersonDetailsBtn.addActionListener(e -> {

            newPerson = PersonHandler.Companion.createPerson();
            int newPersonIndx = Main.dataBase.size() - 1;
            String name = nameInput.getText();
            String age = ageInput.getText();
            String height = heightInput.getText();
            String weight = weightInput.getText();
            String email = emailInput.getText();

            if (!name.equals("")) {
                Main.dataBase.get(newPersonIndx).setName(name);
            }

            if (!age.equals("")) {
                Integer ageInt = Integer.parseInt(age);
                Main.dataBase.get(newPersonIndx).setAge(ageInt);
            }

            if (!weight.equals("")) {
                Integer weightInt = Integer.parseInt(weight);
                Main.dataBase.get(newPersonIndx).setWeight(weightInt);
            }

            if (!height.equals("")) {
                Integer heightInt = Integer.parseInt(height);
                Main.dataBase.get(newPersonIndx).setHeight(heightInt);
            }

            if (!email.equals("")) {
                Main.dataBase.get(newPersonIndx).setEmail(email);
            }


            refreshList();
            clearFields();

            System.out.println(Main.dataBase);
            System.out.println(newPerson.getUserName());
            System.out.println(newPerson.getPassword());



        });

        calculateInchesButton.addActionListener(e1 -> {
                    heightInInchesResult.setText(String.valueOf(PersonHandler.Companion.heightToInches(newPerson)));
        });



        listMain.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                Integer indx = listMain.getSelectedIndex(); // getSelectedIndex takes the index of the element from the GUI list
                if (indx >= 0){
                    System.out.println("This is from the list listener" + Main.dataBase.get(indx));
//                    set the GUI text fields with the elements from the selected row
                    nameInput.setText(Main.dataBase.get(indx).getName());
                    emailInput.setText(Main.dataBase.get(indx).getEmail());
                    ageInput.setText(String.valueOf(Main.dataBase.get(indx).getAge()));
                    weightInput.setText(String.valueOf(Main.dataBase.get(indx).getWeight()));
                    heightInput.setText(String.valueOf(Main.dataBase.get(indx).getHeight()));
                }

            }
        });
        editButton.addActionListener(e2 -> {
            Integer indx = listMain.getSelectedIndex(); // getSelectedIndex takes the index of the element from the GUI list
            if (indx >= 0){
                Main.dataBase.get(indx).setName(nameInput.getText());
                refreshList();

            }
        });
    }

    private void refreshList(){
//        clear the list
        personListModel.removeAllElements();

//        add all elements from the array to the list
        for (Person p : Main.dataBase) {
            personListModel.addElement(p.toString());

        }
    }


//    clear the fields in the list
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
