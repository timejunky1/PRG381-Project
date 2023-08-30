/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicLayer;

import LogicLayer.Model.*;
public class Context {
    Action a;
    public Context(int Port){
        this.a.Port = Port;
    }
    
    public void execute(Register register, String action){
        Registration r = new Registration();
        r.doAction(register);
    }

    public void execute( Student Student, String action){
        
    }

    public void execute( Admin admin, String action)
        {
        switch(action){
            case register
        }
    }
}