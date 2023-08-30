package LogicLayer;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import DataLayer.Controller.*;
import DataLayer.Model.Admin;
import DataLayer.Model.Register;
import DataLayer.Model.Student;

public class Registration extends Action{

    public void doAction(Student student, boolean SQL) {
        // TODO Auto-generated method stub
    }

    public void doAction(Admin admin, boolean SQL) {
        // TODO Auto-generated method stub
    }

    public void doAction(Register register, boolean SQL) {
        try{
            Register register = (Register)id.readObject();
            od.writeObject();
            id.close();
            od.close();
            System.out.println(std.toString());

        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    
}
