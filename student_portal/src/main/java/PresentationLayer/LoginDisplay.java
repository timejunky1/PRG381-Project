/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PresentationLayer;
// Connect to database etc
// import LogicLayer.Login;
// import LogicLayer.Student;
// import LogicLayer.Admin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class LoginDisplay extends JFrame{
    public void login()
    {
        JLabel lblAdmin = new JLabel("Select button 'ADMIN' if you would like to log in as an Admin");
        JLabel lblStudent = new JLabel("Select button 'STUDENT' if you would like to log in as a Student");
        
        JTextField tfSelect = new JTextField();

        JButton btnAdmin = new JButton("ADMIN");
        btnAdmin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // Select next GUI to be displayed
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }});

        JButton btnStudent = new JButton("STUDENT");
        btnStudent.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                //  Select next GUI to be displayed
                //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }});

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnAdmin);
        buttonsPanel.add(btnStudent);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2,1,5,5);
        centerPanel.add(lblAdmin);
        centerPanel.add(lblStudent);
        

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        mainPanel.add(centerPanel, BorderLayout.CENTER);
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
//     Login login;
//     public void display(){
//         System.out.println("Displaying Login");
//         Student student = new Student();
//         login.doAction(student);
//     }
 }
