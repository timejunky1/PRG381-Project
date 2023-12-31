package DataLayer.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Register implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String address;
    private String email;
    private String pswd;
    private String course;


    public Register() {  }


    public Register(String name, String address, String email, String pswd, String course) { // add all perametres which will be set by setters in constructor
        this.setId(id);
        //Setters 
        this.setName(name);
        this.setAddress(address);
        this.setEmail(email);
        this.setPswd(pswd);
        this.setCourse(course);
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

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPswd(){
        return pswd;
    }

    public void setPswd(String pswd){
        this.pswd = pswd;
    }

    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }
}
