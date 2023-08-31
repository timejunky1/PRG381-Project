/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import DataLayer.Model.Admin;
import DataLayer.Model.Student;
import DataLayer.Repository.IAdminRepository;
import DataLayer.Service.StudentService;
@RestController
public class AdminController {
    @Autowired
    IAdminRepository adminRepository;

    //Coppy over from Student controller
      
 //   @Autowired
 //   StudentService studentService;
 //   
 //   @GetMapping("/student")// get all students
 //   public List<Student> addRegister(@RequestBody Student register){
 //       return studentService.getAllStudents();
 //   }
//
 //   @GetMapping("/student/{id}")// get student by ID
 //   public ResponseEntity<Student> getStudentById(@PathVariable("id") int Id){
 //       return new ResponseEntity<Student>(studentService.findByStudentId(Id),HttpStatus.OK);
 //   }
//
 //   @PutMapping("student/id")
 //   public ResponseEntity<Student> updateEmployee(@PathVariable("id") int Id, @RequestBody Student student){
 //       return new ResponseEntity<Student>(studentService.updateStudent(student, Id), HttpStatus.OK);
 //   }
//
 //   @DeleteMapping("student/id")
 //   public ResponseEntity<String> deleteEmployee(@PathVariable("id") int Id){
 //       studentService.deleteStudent(Id);
 //       return new ResponseEntity<String>("Employee deleted successfully.", HttpStatus.OK);
 //   }
}
