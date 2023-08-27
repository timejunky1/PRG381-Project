/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import DataLayer.Model.Admin;
import DataLayer.Repository.IAdminRepository;
@RestController
public class AdminController {
    @Autowired
    IAdminRepository adminRepository;
    
    @GetMapping("/admin") //Get all the admins
    public List<Admin> index(){
        return adminRepository.findAll();
    }


    @GetMapping("/admin/{id}")// Get th admin with the specific ID
    public Optional<Admin> show(@PathVariable String id){
        int adminId = Integer.parseInt(id);
        return adminRepository.findById(adminId);
    }

    @PostMapping("/admin") // Add or register an andmin
    public Admin create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        return adminRepository.save(new Admin());
    }

    @PutMapping("/admin/{id}") // Update an admin with respective ID
    public Admin update(@PathVariable String id, @RequestBody Map<String, String> body){
        int adminId = Integer.parseInt(id);
        // getting student
        Optional<Admin> admin = adminRepository.findById(adminId);
        if(admin.isPresent()){
            Admin admn = admin.get();
            //Implementation of setters
            return adminRepository.save(admn);
        }
        return null;
    }

    @DeleteMapping("admin/{id}") //Delete an admin with the respective ID
    public boolean delete(@PathVariable String id){
        int adminId = Integer.parseInt(id);
        adminRepository.deleteById(adminId);
        return true;
    }
}
