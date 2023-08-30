/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicLayer;
import DataLayer.Model.*;

 public class Login extends Action{

    String LogMsg = "";

    public void doAction(Student student) {
        System.out.println("Login Student");
        try{
            //see if login exists
            //if exist login else throw exception with custom message
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }

    public void doAction(Admin admin) {
        System.out.println("Login Student");
        try{
           //see if login exists
           //if exist login else throw exception with custom message
        }catch(Exception ex){
           System.out.println(ex.toString());
        }
    }

    public void doAction(Register register){

    }
}
