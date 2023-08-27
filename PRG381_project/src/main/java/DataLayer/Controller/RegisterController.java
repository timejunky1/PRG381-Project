package DataLayer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import DataLayer.Model.Register;
import DataLayer.Repository.IRegisterRepository;

@RestController
public class RegisterController {
    @Autowired
    IRegisterRepository registerRepository;

    @PostMapping("/admin")// add a new register
    public Register create(@RequestBody String[] body){
        String name = " ";
        String address = " ";
        String email = " ";
        String password = " ";
        return registerRepository.save(new Register());//add all perametres
    }
}