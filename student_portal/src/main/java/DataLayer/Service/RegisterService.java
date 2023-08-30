package DataLayer.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import DataLayer.Model.Register;
import DataLayer.Model.Student;
import DataLayer.Repository.IRegisterRepository;

@Service
public class RegisterService {
    StudentService studentService;
    IRegisterRepository registerRepository;
    List<Register> registerR = new ArrayList<Register>();
    boolean useSQL;

    public Register registerStudent(Register register){
        String name = register.getName();
        String email = register.getEmail();
        String address = register.getAddress();
        String pswd = register.getPswd();
        boolean able = (studentService.findByEmail(email)!=null);
        if(useSQL){
            Register result = registerRepository.save(register);
            if(result != null && able){
                Student student = studentService.saveStudent(new Student(name,address,email,pswd));
            }
            return register;
        }
        if(able){
            Student student = studentService.saveStudent(new Student(name,address,email,pswd));
            registerR.add(register);
        }
        return register;
    }
}