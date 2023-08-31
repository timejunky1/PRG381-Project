package PresentationLayer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Connect to database etc
 public class AdminDisplay extends JFrame{
    public void login()
    {
        JLabel lblID = new JLabel("Student ID");
        JTextField tfID = new JTextField();

        JLabel lblFirstName = new JLabel("First Name");
        JTextField tfFirstName = new JTextField();

        JLabel lblLastName = new JLabel("Last Name");
        JTextField tfLastname = new JTextField();

        JLabel lblEmail = new JLabel("Student email");
        JTextField tfEmail = new JTextField();

        JLabel lblAddress = new JLabel("Residential address");
        JTextField tfAddress = new JTextField();

        JButton btnAdd = new JButton("Next");
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Select next GUI to be displayed
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }});

        JButton btnDelete = new JButton("Next");
        btnDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Select next GUI to be displayed
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }});

        JButton btnUpdate = new JButton("Next");
        btnUpdate.addActionListener(new ActionListener() {

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
        buttonsPanel.add(btnCancel);

        JPanel studentDetails = new JPanel();
        studentDetails.setLayout(new GridLayout(4,2,5,5);
        studentDetails.add(lblFirstName);
        studentDetails.add(tfFirstName);
        studentDetails.add(lblLastName);
        studentDetails.add(tfLastname);
        studentDetails.add(lblID);
        studentDetails.add(tfID);
        studentDetails.add(lblPassword);
        studentDetails.add(tfPassword);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(formCredentials, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        setTitle("Admin Portal: Search, Create, Delete, Update student accounts");
        setMinimumSize(new Dimension(500,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    } 

    public static void main(String[] args) 
    {
        AdminDisplay login1 = new AdminDisplay();
    }
//public  {
    
//}
