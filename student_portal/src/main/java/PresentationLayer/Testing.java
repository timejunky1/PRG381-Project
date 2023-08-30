/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PresentationLayer;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import org.springframework.http.ResponseEntity;

import DataLayer.Model.*;
import LogicLayer.*;
public class Testing {

    public static void main(String[] args) {
        //Context context = new Context(new Register());
        //context.doAction(student);
        
        try{
            Socket s = new Socket("127.0.0.1/student",8080);
         
            ObjectOutputStream od = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream id = new ObjectInputStream(s.getInputStream());
            od.writeObject(new Register("Jo", "23 Avenue", "Jo@gmail.com", "ewerq", "Beng" ));
            ResponseEntity<Register> res = (ResponseEntity<Register>) id.readObject();
            id.close();
            od.close();
            System.out.println(res.toString());
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
}
