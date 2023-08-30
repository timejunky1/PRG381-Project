package DataLayer.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import DataLayer.Model.Register;
import DataLayer.Model.Student;
import DataLayer.Repository.IRegisterRepository;
import DataLayer.Service.RegisterService;

@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @PostMapping("/register")// add a new register
    public ResponseEntity<Register> addRegister(@RequestBody Register register){
        return new ResponseEntity<Register>(registerService.registerStudent(register), HttpStatus.CREATED);//add all perametres
    }
}