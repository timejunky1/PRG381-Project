import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Connect to database etc
 public class StudentLogin extends JFrame{
    public void login()
    {
        JLabel lblFirstName = new JLabel("First Name");
        JTextField tfFirstName = new JTextField();

        JLabel lblLastName = new JLabel("Last Name");
        JTextField tfLastname = new JTextField();
        
        JLabel lblID = new JLabel("Student ID");
        JTextField tfID = new JTextField();

        JLabel lblEmail = new JLabel("Your Student Email");
        JTextField tfEmail = new JTextField();

        JLabel lblPassword = new JLabel("Top Secret");
        JTextField tfPassword = new JTextField();

        JButton btnNext = new JButton("Next");
        btnSelect.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Select next GUI to be displayed
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }});

            JButton btnRegister = new JButton("Next");
            btnRegister.addActionListener(new ActionListener() {
    
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Select next GUI to be displayed
                    //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                }});

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement code to clear everything and close program
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }});

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnNext);
        buttonsPanel.add(btnRegister);
        buttonsPanel.add(btnCancel);

        JPanel formCredentials = new JPanel();
        formCredentials.setLayout(new GridLayout(4,2,5,5);
        formCredentials.add(lblFirstName);
        formCredentials.add(tfFirstName);
        formCredentials.add(lblLastName);
        formCredentials.add(tfLastname);
        formCredentials.add(lblID);
        formCredentials.add(tfID);
        studentDetails.add(lblEmail);
        studentDetails.add(tfEmail);
        formCredentials.add(lblPassword);
        formCredentials.add(tfPassword);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formCredentials, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        setTitle("Student login credentials");
        setMinimumSize(new Dimension(500,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    } 

    public static void main(String[] args) 
    {
        StudentLogin login1 = new StudentLogin();
    };