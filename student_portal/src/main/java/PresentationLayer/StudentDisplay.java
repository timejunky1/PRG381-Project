import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Connect to database etc
 public class StudentDisplay extends JFrame{
    public void login()
    {
        JLabel lblFirstName = new JLabel("First Name");
        JTextField tfFirstName = new JTextField();

        JLabel lblLastName = new JLabel("Last Name");
        JTextField tfLastname = new JTextField();

        JButton btnSelect = new JButton("Select");
        btnSelect.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Select next GUI to be displayed
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }});

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement code to close program
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }});

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnSelect);
        buttonsPanel.add(btnCancel);

        JPanel formCredentials = new JPanel();
        formCredentials.setLayout(new GridLayout(4,1,5,5);
        formCredentials.add(lblFirstName);
        formCredentials.add(tfFirstName);
        formCredentials.add(lblLastName);
        formCredentials.add(tfLastname);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formCredentials, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        setTitle("Welcome to the student portal. Please make your login selection.");
        setMinimumSize(new Dimension(500,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    } 

    public static void main(String[] args) 
    {
        LoginDisplay login1 = new LoginDisplay();
    };