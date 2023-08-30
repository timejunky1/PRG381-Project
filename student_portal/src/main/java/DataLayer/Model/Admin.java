/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String pswd;
    private String contact;


    public Admin() {  }

    public Admin(String name, String pswd, String contact) {// all perametres for fields in Admin
        this.setId(id);
        //Setters
        this.setName(name);
        this.setPswd(pswd);
        this.setContact(contact);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPswd(){
        return pswd;
    }

    public void setPswd(String pswd){
        this.pswd = pswd;
    }

    public String getContact(){
        return contact;
    }
    
    public void setContact(String contact){
        this.contact = contact;
    }

    @Override
    public String toString(){
        return name + ", " + contact;
    }
}
