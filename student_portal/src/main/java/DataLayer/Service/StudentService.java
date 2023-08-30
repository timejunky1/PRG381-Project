package DataLayer.Service;

import java.lang.module.ResolutionException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import DataLayer.Model.Student;
import DataLayer.Repository.IStudentRepository;

@Service
public class StudentService {
    IStudentRepository studentRepository;
    boolean useSQL;

    List<Student> studentR = new ArrayList<Student>();

    public Student findByEmail(String email){
        List<Student> students = studentR;
        if(useSQL){
            students = studentRepository.findAll();
        }
        for(Student s : students){
            if(s.getEmail() == email){
                return s;
            }
        }
        return null;
    }

    public Student saveStudent(Student student){
        if(useSQL){
            return studentRepository.save(student);
        }
        studentR.add(student);
        return student;
    }

    public List<Student> getAllStudents(){
        if(useSQL){
            return studentRepository.findAll();
        }
        return studentR;
    }

    public Student findByStudentId(int id){
        if(useSQL){
            Optional<Student> student = studentRepository.findById(id);
            if(student.isPresent()){
                return student.get();
            }else{
                throw new Error();
            }
        }
        for(Student s: studentR){
            if(s.getId() == id){
                return s;
            }
        }
    }

    public Student updateEmployee(Student student, int id){
        if(useSQL){
            Student existingStudent = studentRepository.findById(id).orElseThrow(() -> new Error());
            existingStudent.setName(student.getName());
            existingStudent.setAddress(student.getAddress());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setPswd(student.getPswd());
            studentRepository.save(existingStudent);
            return existingStudent;
        }
        for(Student s: studentR){
            if(s.getId() == id){
                studentR.remove(s);
                s.setName(student.getName());
                s.setAddress(student.getAddress());
                s.setEmail(student.getEmail());
                s.setPswd(student.getPswd());
                studentR.add(s);
                return s;
            }
        }
    }

}
