/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sjaco
 */
@RestController
public class StudentController {
    
    @Autowired
    IStudentRepository studentRepository;
    
    @GetMapping("/student")
    public List<Student> index(){
        return studentRepository.findAll();
    }


    @GetMapping("/student/{id}")
    public IEntity show(@PathVariable String id){
        int studentId = Integer.parseInt(id);
        return studentRepository.findOne(studentId);
    }

    @PostMapping("/student/search")
    public List<Student> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return studentRepository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
    }

    @PostMapping("/student")
    public Student create(@RequestBody Map<String, String> body){
        String title = body.get("title");
        String content = body.get("content");
        return studentRepository.save(new Student());
    }

    @PutMapping("/student/{id}")
    public Student update(@PathVariable String id, @RequestBody Map<String, String> body){
        int studentId = Integer.parseInt(id);
        // getting student
        Student student = (Student) studentRepository.findOne(studentId);
        //Implementation of setters
        return studentRepository.save(student);
    }

    @DeleteMapping("student/{id}")
    public boolean delete(@PathVariable String id){
        int studentId = Integer.parseInt(id);
        studentRepository.delete(studentId);
        return true;
    }
}
