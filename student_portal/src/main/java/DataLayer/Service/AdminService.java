package DataLayer.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import DataLayer.Model.Admin;
import DataLayer.Repository.IAdminRepository;

@Service
public class AdminService {
    IAdminRepository adminRepository;
    boolean useSQL;
    List<Admin> admin = new ArrayList<Admin>();

    public Admin findByEmail(String email){
        List<Admin> admins = admin;
        if(useSQL){
            admins = adminRepository.findAll();
        }
        for(Admin a : admins){
            if(a.getContact() == email){
                return a;
            }
        }
        return null;
    }

    //Coppy over from StudentService
}
