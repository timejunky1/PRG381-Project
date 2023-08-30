/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import DataLayer.Model.Student;
import DataLayer.Repository.IStudentRepository;
import DataLayer.Service.StudentService;
import jakarta.websocket.server.PathParam;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class StudentController {
    
    @Autowired
    StudentService studentService;
    
    @GetMapping("/student")// get all students
    public List<Student> addRegister(@RequestBody Student register){
        return studentService.getAllStudents();
    }


    @GetMapping("/student/{id}")// get student by ID
    public ResponseEntity<Student> getStudentById(@PathVariable("id") int Id){
        return new ResponseEntity<Student>(studentService.findByStudentId(Id),HttpStatus.OK);
    }
}
