/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PresentationLayer;
// Connect to database etc
// public class RegisterDisplay {
//     public void display(){
//         System.out.println("Displaying Register");
//     }
// }
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class RegisterDisplay extends JFrame{
    public void login()
    {
        JLabel lblFirstName = new JLabel("First Name");
        JTextField tfFirstName = new JTextField();

        JLabel lblLastName = new JLabel("Last Name");
        JTextField tfLastname = new JTextField();

        JLabel lblEmail = new JLabel("Your Student Email");
        JTextField tfEmail = new JTextField();

        JLabel lblAddress = new JLabel("your Residential address");
        JTextField tfAddress = new JTextField();

        JButton btnSubmit = new JButton("Select");
        btnSubmit.addActionListener(new ActionListener() {

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
        buttonsPanel.add(btnSubmit);
        buttonsPanel.add(btnCancel);

        JPanel studentDetails = new JPanel();
        studentDetails.setLayout(new GridLayout(4,1,5,5);
        studentDetails.add(lblFirstName);
        studentDetails.add(tfFirstName);
        studentDetails.add(lblLastName);
        studentDetails.add(tfLastname);
        studentDetails.add(lblEmail);
        studentDetails.add(tfEmail);
        studentDetails.add(lblAddress);
        studentDetails.add(tfAddress);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(studentDetails, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
        setTitle("Welcome to the student portal. Please make your login selection.");
        setMinimumSize(new Dimension(500,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    } 

    public static void main(String[] args) 
    {
        RegisterDisplay login1 = new RegisterDisplay();
    };
