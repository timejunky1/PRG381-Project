/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import DataLayer.Model.Student;
import DataLayer.Repository.IStudentRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class StudentController {
    
    @Autowired
    IStudentRepository studentRepository;
    
    @GetMapping("/student")// get all students
    public List<Student> index(){
        return studentRepository.findAll();
    }


    @GetMapping("/student/{id}")// get student by ID
    public Optional<Student> show(@PathVariable String id){
        int studentId = Integer.parseInt(id);
        return studentRepository.findById(studentId);
    }

    @PostMapping("/student")// create a new student
    public Student create(@RequestBody Map<String, String> body){
        //setting student
        return studentRepository.save(new Student());
    }

    @PutMapping("/student/{id}")// update a student with respective ID
    public Student update(@PathVariable String id, @RequestBody Map<String, String> body){
        int studentId = Integer.parseInt(id);
        Optional<Student> student = studentRepository.findById(studentId);
        if(student.isPresent()){
            Student std = student.get();
            // getting student
            // setting student
            return studentRepository.save(std);
        }
        return null;
    }

    @DeleteMapping("student/{id}")// delete student with respective ID
    public boolean delete(@PathVariable String id){
        int studentId = Integer.parseInt(id);
        studentRepository.deleteById(studentId);
        return true;
    }
}
