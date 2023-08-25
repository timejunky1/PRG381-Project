/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author sjaco
 */
public class AdminController {
    @Autowired
    IAdminRepository adminRepository;
    
    @GetMapping("/admin")
    public List<Admin> index(){
        return adminRepository.findAll();
    }


    @GetMapping("/admin/{id}")
    public IEntity show(@PathVariable String id){
        int studentId = Integer.parseInt(id);
        return adminRepository.findOne(studentId);
    }

    @PostMapping("/admin/search")
    public List<Admin> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return adminRepository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }

    @PostMapping("/admin")
    public Admin create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        return adminRepository.save(new Admin());
    }

    @PutMapping("/admin/{id}")
    public Admin update(@PathVariable String id, @RequestBody Map<String, String> body){
        int adminId = Integer.parseInt(id);
        // getting student
        Admin admin = (Admin) adminRepository.findOne(adminId);
        //Implementation of setters
        return adminRepository.save(admin);
    }

    @DeleteMapping("admin/{id}")
    public boolean delete(@PathVariable String id){
        int adminId = Integer.parseInt(id);
        adminRepository.delete(adminId);
        return true;
    }
}
